import java.util.Scanner;

public class mathods {
    static int proceed(int x,int y)
    {
        int z;
        if(x>y)
        {
            z=x-y;
        }
        else
        {
            z=x+y;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sum=new Scanner(System.in);
        System.out.println("enter A");
        int a=sum.nextInt();
        System.out.println("enter B");
        int b=sum.nextInt();
        int c;
        c= proceed(a,b);
        System.out.println(c);
    }
}
