import java.util.ArrayList;

public class dsa2 {

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(123);
        list.add(67);
        list.add(345);
        list.add(678);
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
