import java.util.*;
public class LinkedListRemove {

    public static LinkedList<Integer> removeLinkedListAfterMth(LinkedList<Integer> list, int m, int n) {
        int i = m;  // Start removing from index m
        while (n-- > 0 && i < list.size()) {
            list.remove(i); // Remove element at index i (since removal shifts elements left)
        }
        return list;
    }

    public static void main(String[] args)
    {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // Example: remove 2 elements after skipping 2 => removes 6 and 7
        LinkedList<Integer> result = removeLinkedListAfterMth(l1, 2, 2);
        System.out.println(result);  // Output: [4, 5, 8]
    }
}
