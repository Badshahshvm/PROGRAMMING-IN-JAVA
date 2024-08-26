import java.util.Scanner;

public class pattern6 {
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
                if((i+j)%2==0)
                {
                    System.out.print("0"+ "");
                }
                else
                {
                    System.out.print("1"+ "");
                }

            }
            System.out.println();
        }
    }
}
