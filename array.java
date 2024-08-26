import java.util.Scanner;

public class array {
    public static void createArray(int a[])
    {

        int s=0;
        for(int i:a)
        {
            System.out.println(i);
            s+=i;
        }
        System.out.println(s);
    }
    public static void maxArray(int a[])
    {
        int max=0;
        int min=0;
        for(int i=0;i<4;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("max = "+max);
    }
    public static int searchArray(int a[], int k) {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    public static void printPair(int a[])
    {
        for(int i=0;i<a.length;i++)
        {   int curr=a[i];
            for(int j=i+1;j<a.length;j++)
            {
                System.out.println("("+curr+","+a[j]+")");
            }
        }
    }
    

    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the size: ");
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        printArray(a);
        createArray(a);
        maxArray(a);
        System.out.println(searchArray(a,90));
        printPair(a);
    }
}
