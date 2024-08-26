import javax.swing.plaf.synth.SynthColorChooserUI;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        System.out.println("enter your choice");
        Scanner choose=new Scanner(System.in);
        int n=choose.nextInt();
        switch(n)
        {
            case 1 : {
                int a = 10, b = 9, c;
                c = a + b;
                System.out.printf("sum=%d", c);
                break;
            }
            case 2 :
            {
                System.out.printf("enter my name");
                break;
            }
            case 3:
            {
                System.out.printf("enter thr numbers");
                int a= choose.nextInt();
                int b= choose.nextInt();
                int c=a+b;
                System.out.printf("sum=%d",c);
                break;

            }
            default : System.out.printf("invalid choice");
            break;
        }
    }
}
