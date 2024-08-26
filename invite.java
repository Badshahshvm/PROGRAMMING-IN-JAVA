import java.util.Scanner;

public class invite
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        if(a==1)
        {
            System.out.println("hello");
        }
        else if(a==2)
        {
            System.out.println("Namastey");
        }
        else if(a==3)
        {
            System.out.println("Bonjour");
         }
        else {
            System.out.println("nothing");
        }
    }
}
