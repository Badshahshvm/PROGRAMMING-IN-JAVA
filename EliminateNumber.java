import java.util.*;
public class EliminateNumber {
    public static int sumOfDigitAfterElimination(int a[])
    {
        int sum=0;
        for(int val:a)
        {
            sum+=digitOfArray(val);
        }
        return sum;

    }

    public static int digitOfArray(int n) {
        List<Integer> l1 = new ArrayList<>();
        int t=n;
        int res=0;
        while(t>0)
        {
            int r=t%10;
            l1.add(r);
            t/=10;
        }
        Collections.sort(l1);
        for(int i=1;i<l1.size()-1;i++)
        {
            res+=l1.get(i);
        }


        return res;



    }

    public static void main(String[] args)
    {
int a[]={234,567,891};
        System.out.println(sumOfDigitAfterElimination(a));
    }
}
