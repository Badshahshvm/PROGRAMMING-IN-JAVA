import java.util.Scanner;

public class recursio7 {
    public static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        return x*power(x,n-1);
    }
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);

        System.out.println("enter the number");
        int x=p.nextInt();
        System.out.println("enter the n:- ");
        int n=p.nextInt();
        System.out.println(power(x,n));
    }
}
