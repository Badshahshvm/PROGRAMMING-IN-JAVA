import java.util.Scanner;

public class cheaklarge {
    public static void main(String[] args) {
        System.out.println("enter the no.s");
        Scanner cheak=new Scanner(System.in);
        int a=cheak.nextInt();
        int b= cheak.nextInt();
        if(a>b)
        {
            System.out.print("larger no. is=");
            System.out.println(a);
        }
        else {
            System.out.print("larger number is=");
            System.out.println(b);
        }

    }
}
