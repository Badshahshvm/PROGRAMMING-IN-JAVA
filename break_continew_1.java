import java.util.Scanner;

public class break_continew_1 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int i;
        for(i=0;i<=n;i++)
        {
            System.out.println(i);
            if(i==4)
            {
                System.out.printf("break");
                continue;
            }
            System.out.println("last");
        }
    }
}
