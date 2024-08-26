import java.util.Scanner;

public class fiboloop {
    public static void main(String[] args) {
        System.out.println("enter the no.");
        Scanner fibo=new Scanner(System.in);
        int n=fibo.nextInt();
        int i,a=0,b=1,c=0;
        System.out.printf("%d\t%d\t",a,b);
        for(i=0;i<=n;i++)
        {

            c=a+b;
            a=b;
            b=c;
            System.out.printf("%d\t",c);
        }
    }
}
