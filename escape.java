import java.util.Scanner;

public class escape {
    public static void main(String[] args)
    {
        Scanner num=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=num.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            System.out.println("java is great");
            if(i==56)
            {
                System.out.println("nothing");
                break;
            }
        }
    }
}
