import java.util.Arrays;

public class SortObject {

    // Make Pair a static nested class so it can be used in the static context of the main method
    public static class Pair implements Comparable<Pair> {
        int x;
        int y;

        // Constructor for Pair
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Compare pairs based on the 'y' value
        public int compareTo(Pair o) {
            return this.x - o.x; // Ascending order by 'y'. Use o.y - this.y for descending.
        }

        // Override toString method to make it easy to print pairs
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args) {
        // Create an array of Pair objects
        Pair arr[] = new Pair[4];
        arr[0] = new Pair(10, 20);
        arr[1] = new Pair(5, 10);
        arr[2] = new Pair(15, 30);
        arr[3] = new Pair(7, 25);

        // Sort the array of pairs based on the compareTo method (by 'y' value)
        Arrays.sort(arr);

        // Print sorted pairs
        for (Pair p : arr) {
            System.out.println(p);
        }
    }
}
