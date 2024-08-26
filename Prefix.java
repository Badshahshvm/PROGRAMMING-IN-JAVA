public class Prefix {

    public static int[] prefixSum(int a[])
    {
        int pref[]=new int[a.length];
         pref[0]=a[0];
         for(int i=1;i<a.length;i++)
         {
             pref[i]=pref[i-1]+a[i];
         }
         return pref;
    }
    public static int[] withoutArrayPrefixSum(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
           a[i]=a[i-1]+a[i];
        }
        return a;
    }
    public static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int a[]={5,8,9,10,4,7};
        int ans[]=prefixSum(a);
        int an[]=withoutArrayPrefixSum(a);
        printArray(an);

    }
}
