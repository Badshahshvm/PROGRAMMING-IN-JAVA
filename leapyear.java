import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner year=new Scanner(System.in);
        int y=year.nextInt();
        if(y%4==0 && y%100!=0 || y%400==0)
        {
            System.out.printf("%d is a leap year",y);
        }
        else
        {
            System.out.printf("%d is not a leap year",y);
        }
    }
}
