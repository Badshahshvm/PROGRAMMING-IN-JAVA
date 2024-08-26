package _COUSTOM27;

import java.security.PrivilegedExceptionAction;
import java.util.Scanner;

class MyException extends Exception{
     @Override
     public String toString()
     {
         return "I am toString()";
     }
     @Override
     public String getMessage()
     {
         return "I am getMessage()";
     }


}

public class _oustom32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        if(a<66)
        {
            try
            {
               // throw new MyException();
                throw new ArithmeticException();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("finished " + a);
            }
        }

    }


}
