import java.util.Scanner;

public class recurssion {
    static int fact(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner take=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=take.nextInt();
       // System.out.println("enter the vallue of n");
        int c=fact(n);
        System.out.printf("factoriial =%d",c);
       /* int n=5;
        int x=fact(n);
        System.out.printf("%d",x);*/
    }
}
