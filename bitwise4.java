public class bitwise4 {
    public static int clearBit(int n, int i)
    {
      int bitmask=~(1<<i);
      return n&bitmask;

        }



    public static void main(String[] aegs)
    {
         int ans=clearBit(5,2);
        System.out.println(ans);
    }
}
