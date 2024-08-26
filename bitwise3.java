public class bitwise3 {
    public static int setBit(int n, int i)
    {
        int bitmask=1<<i;
        return n|bitmask;
    }

    public static void main(String[] ags)
    {
       int ans= setBit(17,3);
        System.out.println(ans);
    }
}
