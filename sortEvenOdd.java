public class sortEvenOdd {
    public static void swapArray(int a[], int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void sortOddEvenArray(int a[])
    {
        int n=a.length;
        int left=0;
        int right=n-1;
        while(left<right)
        {
            if(a[left]%2!=0 && a[right]%2==0)
            {
                swapArray(a,left,right);
                left++;
                right--;
            }
            if(a[left]%2==0)
            {
                left++;
            }
            if(a[right]%2!=0)
            {
                right--;
            }
        }
    }
    public static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int a[]={11,56,8,21,25,67,88};
        sortOddEvenArray(a);
        printArray(a);
    }
}
