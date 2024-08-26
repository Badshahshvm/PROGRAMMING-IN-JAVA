import java.util.Scanner;

public class break_continew {
    public static void main(String[] args) {
        System.out.println("enter the no.");
        Scanner sum=new Scanner(System.in);
        int n=sum.nextInt();
        int i,s=0;
        for(i=0;i<=n;i++)
        {
            s=s+i;
            if(i==5)
            {
                break;
            }
        }
        System.out.printf("sum=%d",s);
    }
}
