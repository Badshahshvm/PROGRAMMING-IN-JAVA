import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateNumber {
    public  static ArrayList<String> generateNumberString(int n,
                                                          ArrayList<String> l1)
    {
        Queue<String> q=new LinkedList<>();

        q.add("1");
        while(n-->0)
        {
            String r=q.remove();
            l1.add(r);
            q.add(r+"0");
            q.add(r+"1");

        }
        return l1;
    }

    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();

        ArrayList<String> ans2=generateNumberString(8,ans);
        for(int i=0;i<ans2.size();i++)
        {
            System.out.print(ans2.get(i)+" ");
        }
    }
}
