import java.util.ArrayList;

public class dsa5 {


    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(120);
        list.add(567);
        list.add(123);
        mainlist.add(list);
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(126);
        list2.add(543);
        list2.add(199);
        mainlist.add(list2);
        for(int i=0;i<mainlist.size();i++)
        {
            ArrayList<Integer> a1=mainlist.get(i);
            for (int j=0;j<a1.size();j++)
            {
                System.out.print(a1.get(j)+" ");
            }
            System.out.println();
        }
    }
}
