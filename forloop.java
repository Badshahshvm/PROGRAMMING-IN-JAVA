import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        System.out.println("enter the no.");
        Scanner fact=new Scanner(System.in);
        int n=fact.nextInt();
        int f=1,i;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.printf("factorial=%d",f);
    }
}
