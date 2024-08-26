public class method8 {
    public static boolean isPrime(int n)
    {
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void numPrime(int n)
    {
        for(int i=2;i<=n;i++)
        {    if(isPrime(i)==true) {//true
            System.out.print(i + " ");
        }
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        numPrime(20);
        System.out.println(isPrime(15));
        numPrime(100);
    }
}
