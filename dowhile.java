import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner natural=new Scanner(System.in);
        int n=natural.nextInt();
        int i=1,f=1;
        do
        {
          f=f*i;
          i++;
        }while(i<=n);
        System.out.printf("factorial=%d",f);
    }
}
