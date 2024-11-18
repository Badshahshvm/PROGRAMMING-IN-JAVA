import java.util.*;
public class Permutation2 {
    public static void swap(int a[],int i,int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static  void  generatePermutation(int a[],int l,int r,List<List<Integer>> l1)
    {

        if (l == r) {
            // Add a copy of the current array to the result
            List<Integer> permutation = new ArrayList<>();
            for (int num : a) {
                permutation.add(num);
            }
            l1.add(permutation);
        }

        for(int i=l;i<=r;i++)
        {
            swap(a,l,i);
            generatePermutation(a,l+1,r,l1);
            swap(a,l,i);
        }

    }


    public static int maxValue(int a[])
    {
        List<List<Integer>> l1=new ArrayList<>();
        List<List<Integer>> l4=new ArrayList<>();
        generatePermutation(a,0,a.length-1,l1);

        int max=Integer.MIN_VALUE;
        for(List<Integer> l2:l1)
        {
            int sum=0;
            List<Integer> l3=new ArrayList<>();
            for(int val:l2)
            {
                sum+=val;
                l3.add(sum);

            }
            l4.add(l3);

        }

        for(List<Integer> l2:l4 )
        {
            int sum=0;
            for(int val:l2)
            {
                sum+=val;
            }
            max=Math.max(sum,max);
        }


        return max;
    }

    public static void main(String[] args) {
        int a[]={3,4,5};
        System.out.println(maxValue(a));
    }
}
