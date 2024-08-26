import java.util.Scanner;

public class prime {
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int i,j,c=2,count=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j%i==0)
                {
                    count++;
                }
                if(c==2)
                {
                    System.out.println(i);
                }
            }
        }

    }
}
