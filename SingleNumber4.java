public class SingleNumber4 {
    public static boolean check(int n,int i)
    {
        int ans=n&(1<<i);
        if(ans==0)
        {
            return false;
        }
        else {
            return true;
        }
    }

    public static int singleThree(int a[])
    {

        int ans=0;
        int n=a.length;
        for(int i=0;i<32;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(check(a[j],i))
                {
                    count++;
                }
            }
            if(count%4==1)
            {
                ans+=(1<<i);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int a[]={2,5,2,2,2};
        System.out.println(singleThree(a));



    }
}
