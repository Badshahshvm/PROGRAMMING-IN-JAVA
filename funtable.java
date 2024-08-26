import java.util.Scanner;

public class funtable {
    static void table(int n) {
        int  i;
        for (i = 1; i <= 10; i++)
        {
            System.out.printf("%d*%d=%d",n,i,n*i);
        }
    }

    public static void main(String[] args) {
        Scanner take=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=take.nextInt();
        table(9);
    }

}
