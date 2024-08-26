import java.util.Scanner;

public class student {
    public static void main(String[] args)
    {
        Scanner sub=new Scanner(System.in);
        System.out.println("enter the marks of each subject:-");
        int phy=sub.nextInt();
        int che=sub.nextInt();
        int eng=sub.nextInt();
        int hin=sub.nextInt();
        int sst=sub.nextInt();
        int sum=phy+che+eng+hin+sst;
        float result=(sum*100)/500f;
        System.out.println(result);
    }
}
