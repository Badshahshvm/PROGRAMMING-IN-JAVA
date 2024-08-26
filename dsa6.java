import java.util.ArrayList;

public class dsa6 {


    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        for(int i=1;i<=5;i++)
        {
            list1.add(i);
        list2.add(i*2);
        list3.add(i*3);
        }
        for(int i=0;i<mainlist.size();i++)
        {
            ArrayList<Integer> curr=mainlist.get(i);
            for(int j=0;j<curr.size();j++)
            {
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
}
