//program to check if an array can be  partioned into sub-arrays with equal sum:--
public class array10 {
    public static int findSumOfArray(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];

        }
        return sum;
    }
    public static boolean checkSumArrrayEqual(int a[])
    {
        int totalSum=findSumOfArray(a);
        int prefSum=0;
        for(int i=0;i<a.length;i++)
        {
            prefSum+=a[i];
            int suffixSum=totalSum-prefSum;
            if(prefSum==suffixSum)
            {
                return true;
            }

        }
        return false;

    }
    public static void main(String[] args)
    {
        int a[]={1,1,1,1,1,1};
        int b[]={3,4,6,7,8,9};
        System.out.println(checkSumArrrayEqual(a));
        System.out.println(checkSumArrrayEqual(b));
    }
}
