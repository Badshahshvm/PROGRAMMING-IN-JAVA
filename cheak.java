import java.util.Scanner;

public class cheak {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner cheak=new Scanner(System.in);
        int n=cheak.nextInt();
        if(n<0)
        {
            System.out.printf("%d is negative",n);
        }
        else {
            System.out.printf("%d is positive no.",n);
        }

    }
}
