public class counting {

    public static void countingSort(int a[])
    {

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            largest=Math.max(largest,a[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<a.length;i++)
        {
            count[a[i]]++;
        }
        //sorting:-
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            while(count[i]>0)
            {
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printA(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int a[]={1,1,4,2,2,8,1,1};
        countingSort(a);
        printA(a);


    }
}
