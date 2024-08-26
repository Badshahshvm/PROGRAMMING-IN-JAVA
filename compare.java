import java.util.*;

public class compare
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number in a:");
        int a=sc.nextInt();
        System.out.println("enter the number in b:");
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("equal");


        } else if (a>b)
        {
            System.out.println("greater");
        }
         else

        {
            System.out.println("lesser");
        }

    }
}
