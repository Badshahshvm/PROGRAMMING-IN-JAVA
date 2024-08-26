import java.util.Scanner;

public class patern1 {
    public static void main(String[] aergs)
    {
        Scanner x=new Scanner(System.in);
        int i,j;
        System.out.println("enter the number: ");
        int n=x.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
