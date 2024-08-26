import java.util.Scanner;

public class culturejava
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("press the button:");
        int button=sc.nextInt();
        switch(button) {
            case 1:
                System.out.println("hello");
                break;

            case 2:
                System.out.println("Namastey");
            case 3:
                System.out.println("bonjour:");
            default:
                System.out.println("invaild");
        }
    }
}
