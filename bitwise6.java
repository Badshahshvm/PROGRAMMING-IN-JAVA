import java.sql.SQLOutput;

public class bitwise6 {


    public static int rangeBit(int n,  int i, int j)
    {
        int a=~0<<j+1;
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static void main(String[] args)
    {
     int ans=rangeBit(67,0,1);
        System.out.println(ans);
    }
}
