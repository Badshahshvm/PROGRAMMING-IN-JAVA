import java.util.ArrayList;

public class dsa3 {


    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(567);
        list.add(456);
        list.add(234);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>max)
            {
                max=list.get(i);
            }
        }
        System.out.println("maximum elent is "+max);
    }
}
