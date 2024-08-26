public class EliminateMaxMin {
    public static int[] findMinMax(int n)
    {
        int a[]=new int[2];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        while(n>0)
        {
            int d=n%10;
            max=Math.max(max,d);
            min=Math.min(min,d);
            n/=10;
        }
        a[0]=max;
        a[1]=min;
        return a;

    }

    public  static int sumOfDigit(int n,int a[])
    {
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            if(a[0]!=d && a[1]!=d)
            {
                sum+=d;
            }
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[]={1223,234,3445,456};
        int sum=0;

        for(int i=0;i<a.length;i++)
        {
            int b[]=findMinMax(a[i]);
            sum+=sumOfDigit(a[i],b);
        }

        System.out.println(sum);
    }
}
