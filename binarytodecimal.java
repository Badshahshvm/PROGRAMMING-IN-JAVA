import java.util.Scanner;

public class binarytodecimal {


    public static void convertToDec(int n)
    {
        int ans=0,pow=0;
        while(n>0)
        {
            int r=n%10;
            ans=ans+r*(int)Math.pow(2,pow);
            n=n/10;
            pow++;

        }
        System.out.println("decimal is "+ans);
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
       convertToDec(100110);
    }
}
