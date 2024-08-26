import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class recursin1 {
    public static int fib(int n)
    {
        if(n ==0||n==1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main (String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number:- ");
        int n=x.nextInt();
        System.out.println(fib(n));
    }

}
