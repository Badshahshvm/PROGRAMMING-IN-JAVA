public class NextGreaterElementArray {
    public static int[] nextGreater(int a[])
    {
        int ans[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {  ans[i]=-1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[i])
                {
                    ans[i]=a[j];
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args)
    { int a[]={1,3,2,5,8,5,6,3,4};
        int res[]=nextGreater(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
}
