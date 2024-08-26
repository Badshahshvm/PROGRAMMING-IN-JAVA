import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class factjava {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner fact=new Scanner(System.in);
        int n=fact.nextInt();
        int f=1,i=1;
        while(i<=n)
        {
            f=f*i;
            i++;
        }
        System.out.printf("factoria is =%d",f);
    }
}
