import java.util.Scanner;

public class even {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number\n");
        int num= scanner.nextInt();
        if(num%2==0)
        {
            System.out.print("even\n");
        }
        else {
            System.out.print("odd");
        }


    }
}
