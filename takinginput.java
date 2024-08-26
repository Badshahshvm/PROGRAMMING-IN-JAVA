import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        System.out.println("taking inputs");
        Scanner x =new Scanner(System.in);
        System.out.println("enter frist no.");
        int a=x.nextInt();
        System.out.println("enter 2nd no.");
        int b=x.nextInt();
        int c;
        c=a+b;
        System.out.print("sum is");
        System.out.println(c);
        Boolean b1=x.hasNextInt();
        System.out.println(b1);
        String str=x.next();
        System.out.println(str);
        String sc=x.nextLine();
        System.out.println(sc);
    }
}
