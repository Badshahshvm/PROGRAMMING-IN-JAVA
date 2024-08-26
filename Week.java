import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in);
        System.out.println("enter the number(1-7)");
        int num = day.nextInt();
        switch(num) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("wednesday");
                break;
            case 6:
                System.out.println("friday");
                break;
            default:
                System.out.println("satuarday");
        }
    }
}
