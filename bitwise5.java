public class bitwise5 {


    public static int lastBit(int n,int i)
    {
        int bitmask=~0<<i;
        return n&bitmask;
    }

    public static void main(String[] args)
    {
        int ans=lastBit(15,2);
        System.out.println(ans);

    }
}
