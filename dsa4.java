import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class dsa4 {
    public static void swap(ArrayList<Integer> list, int i,int j)
    {
        int temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }


    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(345);
        list.add(267);
        int i=1,j=3;
        System.out.println(list);
        System.out.println("after swapping...");
    //swap(list,i,j);
        System.out.println("sorting");
        Collections.sort(list);
        System.out.println(list);

    }
}
