import java.util.Scanner;

public class chek2{
    public static void display(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(check(i))
            {
                System.out.print(i+" ");
            }
        }
    }



    public static boolean check(int n)
    {
        boolean p= true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                p=false;
                break;
            }
        }
        return p;
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number");
        int n=x.nextInt();
        display(n);
    }
}
