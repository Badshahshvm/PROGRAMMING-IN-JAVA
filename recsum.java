import java.util.Scanner;

public class recsum {
    static int rec(int n)
    {
        int sum=0;
        if(n==0)
        {
            return sum=0;
        }
        else
        {
            return sum=n+rec(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner take=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=take.nextInt();
        int z;
        z=rec(n);
        System.out.println("sum="+z);
    }
}
