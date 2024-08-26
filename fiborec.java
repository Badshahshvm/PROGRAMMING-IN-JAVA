import javax.swing.*;
import java.util.Scanner;

public class fiborec {
    static int fibo(int n)
    {
        //int a=0,b=1,c=0;
        if(n==1)
        {
            //System.out.printf("%d",n);
            return 0;
        }
        else if(n==2)
        {
            //System.out.printf("%d",n);
            return 1;
        }
        else
        {
          //  c=a+b;
            //a=b;
            //b=c;
            //System.out.printf("%d",n);
            return fibo(n-1)+fibo(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner take=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=take.nextInt();
        int z=fibo(n);
        System.out.print(z);
    }
}
