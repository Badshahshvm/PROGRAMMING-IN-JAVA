import java.util.Scanner;

public class sum
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0,i;
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
