import java.util.Scanner;

public class bitwise {

    public static void main(String[] ags)
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int count=0;
        while(n>0)
        {
            if((n & 1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}
