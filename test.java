import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner cheak=new Scanner(System.in);
        System.out.println("enter maths marks" );
        m1=cheak.nextInt();
        System.out.println("enter programming marks" );
        m2=cheak.nextInt();
        System.out.println("enter science marks" );
        m3=cheak.nextInt();
        float avg=(m1+m2+m3)/3.0f;
        if(avg>=40&&m1>=33&&m2>=33&&m3>=33)
        {
            System.out.println("congrates");
        }
        else
            System.out.println("sorry");
    }
}
