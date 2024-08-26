public class leetCode {
    public static int[] leetCode(int a[],int b[])
    {
        int ans[]=new int[a.length];
                for(int i=0;i<a.length;i++)
                {
                    a[i]=-1;
                    for(int j=0;j<b.length;j++)
                    {
                        if(b[j]==a[i])
                        {
                            if(b[j]>a[i])
                            {
                                ans[i]=b[j];
                                break;
                            }
                        }
                    }
                }
                return ans;
    }
    public static void main(String[] args)
    {
        int a[]={4,1,2};
        int b[]={1,3,4,2};
        int res[]=leetCode(a,b);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
