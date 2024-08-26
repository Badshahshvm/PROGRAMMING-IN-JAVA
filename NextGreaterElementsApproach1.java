public class NextGreaterElementsApproach1 {
    public static void main(String[] args)
    {
        int a[]={1,3,2,1,8,6,3,4};
        int res[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            res[i]=-1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[i])
                {
                    res[i]=a[j];
                    break;
                }
            }
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
