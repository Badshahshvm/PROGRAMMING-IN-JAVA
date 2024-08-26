import java.util.Scanner;

public class funpatern1 {
    static void pattern(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++) {
                System.out.printf("*");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
       // int n=5;
        Scanner take=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=take.nextInt();
        pattern(n);
    }
}
