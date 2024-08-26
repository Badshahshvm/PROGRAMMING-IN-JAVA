import java.util.*;

class DistanceVectorRouter {
    private int nodeId;
    private Map<Integer, Integer> distanceVector;
    private Map<Integer, Map<Integer, Integer>> neighbors;

    public DistanceVectorRouter(int nodeId) {
        this.nodeId = nodeId;
        this.distanceVector = new HashMap<>();
        this.neighbors = new HashMap<>();
        distanceVector.put(nodeId, 0);
    }

    public void addNeighbor(int neighborId, int cost) {
        neighbors.put(neighborId, new HashMap<>());
        distanceVector.put(neighborId, cost);
    }

    public void updateNeighborDistanceVector(int neighborId, Map<Integer, Integer> neighborDV) {
        neighbors.put(neighborId, neighborDV);
        updateDistanceVector();
    }

    private void updateDistanceVector() {
        for (Map.Entry<Integer, Map<Integer, Integer>> neighborEntry : neighbors.entrySet()) {
            int neighborId = neighborEntry.getKey();
            Map<Integer, Integer> neighborDV = neighborEntry.getValue();

            for (Map.Entry<Integer, Integer> entry : neighborDV.entrySet()) {
                int destinationId = entry.getKey();
                int newCost = distanceVector.get(neighborId) + entry.getValue();

                if (!distanceVector.containsKey(destinationId) || newCost < distanceVector.get(destinationId)) {
                    distanceVector.put(destinationId, newCost);
                }
            }
        }
    }

    public Map<Integer, Integer> getDistanceVector() {
        return distanceVector;
    }

    public void printDistanceVector() {
        System.out.println("Distance vector for node " + nodeId + ":");
        for (Map.Entry<Integer, Integer> entry : distanceVector.entrySet()) {
            System.out.println("To node " + entry.getKey() + " via " + nodeId + " cost: " + entry.getValue());
        }
    }
}

public class DistanceVectorAlgorithm {
    public static void main(String[] args) {
        DistanceVectorRouter router1 = new DistanceVectorRouter(1);
        DistanceVectorRouter router2 = new DistanceVectorRouter(2);
        DistanceVectorRouter router3 = new DistanceVectorRouter(3);

        router1.addNeighbor(2, 1);
        router1.addNeighbor(3, 4);

        router2.addNeighbor(1, 1);
        router2.addNeighbor(3, 2);

        router3.addNeighbor(1, 4);
        router3.addNeighbor(2, 2);

        router1.updateNeighborDistanceVector(2, router2.getDistanceVector());
        router1.updateNeighborDistanceVector(3, router3.getDistanceVector());

        router2.updateNeighborDistanceVector(1, router1.getDistanceVector());
        router2.updateNeighborDistanceVector(3, router3.getDistanceVector());

        router3.updateNeighborDistanceVector(1, router1.getDistanceVector());
        router3.updateNeighborDistanceVector(2, router2.getDistanceVector());

        router1.printDistanceVector();
        router2.printDistanceVector();
        router3.printDistanceVector();
    }
}
