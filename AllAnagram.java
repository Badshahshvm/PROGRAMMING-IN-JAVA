import java.util.ArrayList;
import java.util.HashMap;

public class AllAnagram {
    public static ArrayList<Integer> allAnagramFound(String s, String p) {
        int n = p.length();
        int m = s.length();
        ArrayList<Integer> l1 = new ArrayList<>();
        HashMap<Character, Integer> hp = new HashMap<>();
        HashMap<Character, Integer> hs = new HashMap<>();
        int matchCount = 0;

        // Populate the hashmap for the pattern 'p'
        for (int i = 0; i < n; i++) {
            hp.put(p.charAt(i), hp.getOrDefault(p.charAt(i), 0) + 1);
        }

        // Populate the initial window in the string 's'
        for (int i = 0; i < n; i++) {
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);
            if (hs.get(s.charAt(i)) <= hp.getOrDefault(s.charAt(i), 0)) {
                matchCount++;
            }
        }

        // Check if the first window is an anagram
        if (matchCount == n) {
            l1.add(0);
        }

        // Sliding window
        int sp = 0;
        int ep = n;
        while (ep < m) {
            // Add the new character to the window
            char newChar = s.charAt(ep);
            hs.put(newChar, hs.getOrDefault(newChar, 0) + 1);
            if (hs.get(newChar) <= hp.getOrDefault(newChar, 0)) {
                matchCount++;
            }

            // Remove the old character from the window
            char oldChar = s.charAt(sp);
            if (hs.get(oldChar) <= hp.getOrDefault(oldChar, 0)) {
                matchCount--;
            }
            hs.put(oldChar, hs.get(oldChar) - 1);

            sp++;
            ep++;

            // Check if the current window is an anagram
            if (matchCount == n) {
                l1.add(sp);
            }
        }

        return l1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = allAnagramFound("cbaebabacd", "abc");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
    }
}
