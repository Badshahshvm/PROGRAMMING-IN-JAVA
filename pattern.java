import java.util.*;

public class pattern
{
    public  static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number:");
    int n=sc.nextInt();
    int i,j;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n-i;j++)
        {System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            if((i+j)%2==0)
            {
                System.out.print(1);
            }
            else {
                System.out.print(0);
            }
        }
        System.out.println();
    }
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++) {
            System.out.print("*");
        }
        for(j=1;j<=2*n-i;j++)
        {
                System.out.print(" ");
            }
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for(i=n;i>=1;i--)
    {
        for(j=1;j<=i;j++) {
            System.out.print("*");
        }
        for(j=1;j<2*n-i;j++)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
