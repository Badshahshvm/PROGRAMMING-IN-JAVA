public class method2 {
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static int sub(int x, int y)
    {
        if(x>y)
        {
            return x-y;
        }
        else
            return y-x;
    }
    public static void main(String[] args)
    {
        sum(12,20);
        System.out.println(sum(12,20));
        sub(56,78);
        System.out.println(sub(56,78));
    }
}
