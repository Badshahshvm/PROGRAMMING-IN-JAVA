import java.util.Scanner;

public class recursion2 {
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number:-");
        int n=x.nextInt();
        System.out.println(fact(n));
    }
}
