import java.security.PublicKey;
import java.util.ArrayList;

public class detectCycle {

    public static class Edge
    {
        int src;
        int dest;
        public Edge(int src,int dest)
        {
            this.src=src;
            this.dest=dest;

        }
    }
    public static void createGrah(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();

        }
        graph[0].add(new Edge(0,1));
    }
}
