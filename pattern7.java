import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter tne number: ");
        int n=x.nextInt();
        int i,j;
        char ch='A';
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch+ " ");

            }
            System.out.println();
        }
    }
}
