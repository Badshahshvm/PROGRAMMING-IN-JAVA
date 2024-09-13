public class XorQuerries {
    public static int [] prefixXor(int a[])
    {
        int n=a.length;
        int p[]=new int[n];
        p[0]=a[0];
        for(int i=1;i<n;i++)
        {
            p[i]=a[i]^p[i-1];
        }
        return p;
    }

    public static int [] querriesXor(int a[],int q[][])
    {
        int p[]=prefixXor(a);
        int n=q.length;
        for(int i=0;i<n;i++)
        {
            int l=q[i][0];
            int r=q[i][1];
            if(l==0)
            {
                p[i]=a[l];
            }
            else {
                p[i]=p[r]^p[l-1];
            }
        }
        return p;
    }
    public static void main(String[] args) {
        int a[]={2,4,5,67,8};
        int q[][]={{0,1},{2,3},{1,4}};
        int ans[]=querriesXor(a,q);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }
}
