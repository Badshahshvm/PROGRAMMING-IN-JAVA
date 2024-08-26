public class bitwise7 {

    public static boolean powerOf(int n)
    {
        if((n&n-1)==0)
        {
            System.out.println("power of two....");
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        boolean ans=powerOf(17);
        System.out.println(ans);
        boolean s=powerOf(16);
        System.out.println(s);
    }
}
