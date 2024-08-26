import java.util.Scanner;

public class decimaltobinary
{
    public static void converTo(int n)
    {
        int ans=0;
        int pow=0;
        while(n>0)
        {
            int r=n%2;
            ans=ans+r*(int)Math.pow(10,pow);
            n=n/2;
            pow++;
        }
        System.out.println(ans);

    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        converTo(12);
    }
}
