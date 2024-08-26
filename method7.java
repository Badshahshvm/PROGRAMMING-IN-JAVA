import javax.swing.plaf.BorderUIResource;

public class method7 {
    public static boolean printPrime(int n)
    { boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                prime=false;
            }
        }
       return prime;
    }
    public static void main(String[] args)
    {
        System.out.println(printPrime(45));
    }
}
