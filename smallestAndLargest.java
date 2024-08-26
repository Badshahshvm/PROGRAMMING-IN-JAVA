import java.util.Arrays;

public class smallestAndLargest {


    public static int[] maxAndMin(int a[])
    {
        Arrays.sort(a);
        int ans[]={a[0],a[a.length-1]};
        return ans;


    }
    public static void main(String[] args)
    {
        int a[]={12,5,6,89,110};
        int ans[]=maxAndMin(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
