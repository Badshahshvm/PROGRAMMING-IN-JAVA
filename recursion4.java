import java.util.Scanner;

public class recursion4 {
    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=x.nextInt();
        System.out.println(sum(n));
    }
}
