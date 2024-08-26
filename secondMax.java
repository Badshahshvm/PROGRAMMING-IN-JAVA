public class secondMax {


    public static int max(int a[])
    {

        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    public static int findLargestSecond(int a[])
    {
        int mx=max(a);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==mx)
            {
                a[i]=-1;
            }
        }

        int second=max(a);
        return second;
    }
    public static void main(String[] args)
    {
        int a[]={12,5,8,9,11};
        System.out.println(findLargestSecond(a));
    }
}
