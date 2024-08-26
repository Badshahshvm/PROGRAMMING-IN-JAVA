import java.io.PrintStream;
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        System.out.println("enter the no.");
        Scanner loop=new Scanner(System.in);
        int n=loop.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.printf("%d", i);
            i++;
        }
    }
}
