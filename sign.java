import java.util.Scanner;

public class sign {
    public static void main(String[] args)
    {
        Scanner sub=new Scanner(System.in);
        System.out.println("enter the marks of physics");
        int phy=sub.nextInt();
        System.out.println("enter the marks of chemistry");
        int chem=sub.nextInt();
        System.out.println("enter the marks of physics");
        int math=sub.nextInt();
        int sum;
        sum = math+phy+chem;
        float pre=sum*100/300f;
        if(math>=33&&chem>=33&&phy>=33) {
            if (pre >= 44)
                System.out.println("pass");

            else
                System.out.println("fail");
        }
        else
            System.out.println("no");
    }


}
