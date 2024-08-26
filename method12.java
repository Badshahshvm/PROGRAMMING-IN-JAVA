public class method12 {
    public static void decimalToBinary(int n)
    {
        int bin=0;
        int pow=0;
        while(n>0)
        {
            int r;
            r=n%2;
            bin=bin+r*(int)Math.pow(10,pow);
            pow++;
            n=n/2;

        }
        System.out.println(bin);
    }
    public static void main(String[] args)
    {
        decimalToBinary(15);
        decimalToBinary(44);
    }
}
