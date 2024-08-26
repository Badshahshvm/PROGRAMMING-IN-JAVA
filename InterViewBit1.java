import java.util.ArrayList;

public class InterViewBit1 {
    public static int solve(ArrayList<Integer> A) {
        int sum=0;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++)
        {   if(A.get(i)> Integer.MIN_VALUE && A.get(i)<Integer.MAX_VALUE)
        {
            if(max<A.get(i))
            {
                max=A.get(i);
            }
            {
                min=A.get(i);
            }
        }



        }
        System.out.println(max);
        System.out.println(min);
        sum=max-min;
        return sum;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(-2);
        A.add(1);
        A.add(-4);
        A.add(5);
        A.add(3);
        System.out.println(solve(A));


    }
}
