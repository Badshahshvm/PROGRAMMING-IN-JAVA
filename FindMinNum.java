public class FindMinNum {
    public static int sumOfN(int n)
    {
        int min=Integer.MAX_VALUE;
        if(n==0 || n==1)
        {
            return n;
        }

        for(int i=1;i*i*i<=n;i++)
        {
            int t=sumOfN(n-i*i*i);

            min=Math.min(min,t);
        }
        return min+1;
    }

    public static void main(String[] args) {
        System.out.println(sumOfN(10));
    }
}
