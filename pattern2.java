import java.util.Scanner;

public class pattern2 {
    static void pat(int n)
    {
        int i,j;
        for(i=5;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.printf("#");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Scanner take=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=take.nextInt();
        pat(n);
    }
}
