public class bitwise2 {

    public static int getBit(int n, int i)
    {
        int bitmask=1<<i;
        if((n&bitmask) ==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }

    }
    public static void main(String[] args)
    {
  int ans=getBit(15,4);
        System.out.println(ans);
    }
}
