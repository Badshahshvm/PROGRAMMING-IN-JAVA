import java.util.*;
public class GenerateAllPrefixString {






    public static List<String>  prefixString(String ans)
    {
        List<String> l1=new ArrayList<>();
        for(int i=0;i<ans.length();i++)
        {
            l1.add(ans.substring(0,i+1));
        }
        return l1;
    }
    public static List<String>  sufixString(String ans)
    {
        List<String> l1=new ArrayList<>();

        for(int i=ans.length()-1;i>=0;i--)
        {
            l1.add(ans.substring(i,ans.length()));
        }
        return l1;
    }
    public static void main(String ars[])
    {
        Scanner x=new Scanner(System.in);
        String ans=x.nextLine();
        List<String>l1=prefixString(ans);
        for(String w:l1)
        {
            System.out.print(w+" ");
        }
        System.out.println();
        List<String> l2=sufixString(ans);
        for(String w:l2)
        {
            System.out.print(w+" ");
        }
    }
}
