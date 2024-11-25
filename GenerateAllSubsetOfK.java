import java.util.*;

class GenerateAllSubsetOfK {

    public static void generateAllSubsetSumOfK(int a[], int l, int k, int sum, List<Integer> current, List<List<Integer>> l1) {
        if (l == a.length) {
            if (sum == k) {
                l1.add(new ArrayList<>(current));
            }
            return;
        }
        current.add(a[l]);
        generateAllSubsetSumOfK(a, l + 1, k, sum + a[l], current, l1);
        current.remove(current.size() - 1);
        generateAllSubsetSumOfK(a, l + 1, k, sum, current, l1);
    }

    public static List<List<Integer>> generateSubset(int a[], int k) {
        List<List<Integer>> l1 = new ArrayList<>();
        generateAllSubsetSumOfK(a, 0, k, 0, new ArrayList<>(), l1);
        return l1;
    }

    public static void main(String[] args) {
        int a[] = {2, 3, 5, 6, 8, 10};
        List<List<Integer>> l1 = generateSubset(a, 10);
        for (List<Integer> l2 : l1) {
            for (int val : l2) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
