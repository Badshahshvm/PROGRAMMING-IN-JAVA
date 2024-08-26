import java.util.Scanner;

public class number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:- ");
        int a=sc.nextInt();
        int sum=0;
        int i=1,b=100;
        while(i<=a)
        {
            System.out.printf(i + " ");
            i++;
        }
        System.out.println(" ");
        while(b>=1)
        {
            System.out.println(b +" ");
            b--;
        }
        System.out.println(" ");
        for(int j =1;j<=7;j++)
        {
            System.out.println("**********");
        }
        for( int t=1;t<=a;t++)
        {

            sum=sum+t;

        }
        System.out.println(sum);
    }
}
