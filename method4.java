public class method4 {
    public static int printFacti(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static int printBinomial(int n, int r)
    {
        int f1=printFacti(n);
        int f2=printFacti(r);
        int f3=printFacti(n-r);
        return f1/(f2*f3);

    }
    public static void main(String[] args)
    {
        System.out.println(printBinomial(8,3));
        System.out.println(printFacti(6));
    }
}
