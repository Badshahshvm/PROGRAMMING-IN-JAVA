import java.util.Scanner;

public class method3 {
    public static int printFact(int n)
    {
        Scanner x=new Scanner(System.in);

        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        System.out.println( printFact(15));
        System.out.println( printFact(5));

    }
}
