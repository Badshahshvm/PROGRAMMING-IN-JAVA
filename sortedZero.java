public class sortedZero {
    public static void sortZero(int a[])
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(i<count)
            {
                a[i]=0;
            }
            else {
                a[i]=1;
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
    //by two pointer methods:-
    public static void swapArray(int a[],int i,int j)
    {




              int temp=a[i];
              a[i]=a[j];
              a[j]=temp;


    }
    public static void sortZerosAndOnes(int a[])
    {
        int n=a.length;
        int left=0;
        int right=n-1;
        while(left<right)
        {
            if(a[left]==1&&a[right]==0)
            {
                swapArray(a,left,right);
                left++;
                right--;
            }
            if(a[left]==0)
            {
                left++;
            }
            if(a[right]==1)
            {
                right--;
            }
        }
        printArray(a);
    }
    public static void main(String[] args)
    {
        int a[]={1,1,0,1,0,1,1,0,0,0,1,1};

         ;
        sortZerosAndOnes(a);


    }
}
