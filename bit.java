import java.util.Scanner;

public class bit {
    public static boolean powerOfTwo(int n)
    {
        return (n&n-1)==0;

    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number");
        int n=x.nextInt();
        System.out.println(powerOfTwo(n));
    }
}
