import java.util.Scanner;

public class bit1 {
    public static void oddEven(int n)
    {
        int bitmask=1;
        if((n & bitmask)==0)
        {
            System.out.println(n + "  is even");
        }
        else {
            System.out.println(n + " is odd ");
        }
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number:= ");
        int n=x.nextInt();
        oddEven(n);
    }
}
