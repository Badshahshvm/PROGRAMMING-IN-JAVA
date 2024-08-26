import java.util.Scanner;

public class patter5 {
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number:- ");
        int n=x.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
