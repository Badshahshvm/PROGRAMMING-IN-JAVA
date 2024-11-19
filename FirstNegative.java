import java.lang.reflect.Array;
import java.util.*;

public class FirstNegative {
    public static ArrayList<Integer> firsT(int a[],int k)
    {
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<=a.length-k;i++)
        {
            for(int j=0;j<k;j++)
            {
                int index=i+j;
                if(a[index]<0)
                {
                    l1.add(a[index]);
                }
            }

        }
        return l1;
    }
    public static void main(String[] args) {
        int a[]={-1,3,4,5,-6,9,11,45};
        ArrayList<Integer> l1=firsT(a,4);
        for(int val:l1)
        {
            System.out.print(val+" ");
        }


    }
}
