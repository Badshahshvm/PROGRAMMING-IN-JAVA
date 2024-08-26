import java.util.Scanner;

public class p1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter the number: ");
            int n=sc.nextInt();
            if(n%5 ==0 && n%10==0)
            {
                break;
            }
            System.out.println(n);

        }while(true);
    }
}
