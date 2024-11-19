import java.util.*;
public class generateSubstring {
    public static List<String> generateSubstrings(String str) {
        int n = str.length();
        List<String> l1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                l1.add(str.substring(i, j));
            }
        }
        return l1;
    }
    public static  List<String> generateSubstringOfN(int n)
    {
        List<String> l2 = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            l2.add(Integer.toBinaryString(i));
        }
        return l2;

    }
    public static void main(String[] args) {
        String s="10011";
        List<String> l1=generateSubstrings(s);
        for(int i=0;i<l1.size();i++)
        {

            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
        List<String> l2=generateSubstringOfN(5);
        for(int i=0;i<l2.size();i++)
        {

            System.out.print(l2.get(i)+" ");
        }

    }
}
