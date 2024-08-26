public class array3 {

    public static int largest(int a[])
    {
        int largest=Integer.MIN_VALUE; //minus infinite
        for(int i=0;i<a.length;i++)
        {
            if(largest<a[i])
            {
                largest=a[i];
            }
        }
        return largest;
    }
    public static int smallest(int a[])
    {
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(smallest>a[i])
            {
                smallest=a[i];
            }
        }
        return smallest;


    }
    public static void main(String[] args)
    {
        int a[]={12,35,67,90,111,789};
        System.out.println("largest element is "+largest(a));
        System.out.println("smallest elements is "+smallest(a));
    }
}
