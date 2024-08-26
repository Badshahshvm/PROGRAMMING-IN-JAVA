import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=x.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
