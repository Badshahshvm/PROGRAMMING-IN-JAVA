public class method11 {
    public static void binToDecimal(int n)
    {
        int pow=0;
        int dec=0;
        while(n>0)
        {
            int r;
            r=n%10;
            dec=dec+r*(int)Math.pow(2,pow);
            pow++;
            n=n/10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args)
    {
        binToDecimal(101);
        binToDecimal(1101);
        binToDecimal(100110);
    }
}
