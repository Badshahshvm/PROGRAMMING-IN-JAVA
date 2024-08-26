import java.util.Arrays;

public class RearranageArray {
    public static void reverse(int a[], int i, int j)
    {
       int temp=a[i];
       a[i]=a[j];
       a[j]=temp;


    }
    public static int [] rearrange(int a[])
    {
        Arrays.sort(a);
        int n=a.length;
        int m=n/2;
        reverse(a,m,n-1);
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,5,0,4,12};
        int ans[]=rearrange(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }


    }
}
