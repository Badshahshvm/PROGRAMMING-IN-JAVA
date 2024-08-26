
//print the elements of array:-

public class Recursion3 {

    public static void printArray(int a[], int i)
    {
        if(i==a.length)
        {
            return;
        }
        System.out.println(a[i]);
        printArray(a,i+1);
    }
    public static int sumArray(int a[], int i)
    {
        if(i==a.length-1)
        {
            return a[i];
        }
        int ans=sumArray(a,i+1);
        return ans+a[i];
    }
    //find all index of elements who is present in array:-
    public static void findAllIndices(int a[], int n, int target, int i)
    {
        if(i>=n)
        {
            return;
        }
        if(a[i]==target)
        {
            System.out.println(i);
        }
        findAllIndices(a,n,target,i+1);
    }
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6,7,89};
        printArray(a,0);
        int s=sumArray(a,0);
        System.out.println(s);
        int b[]={1,3,4,7,3,9,3};
        findAllIndices(b,7,3,0);

    }
}
