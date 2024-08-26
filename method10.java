public class method10 {
    public static boolean isEven(int n)
    {
        boolean even=true;
        for(int i=1;i<=n;i++)
        {
            if(n%2!=0)
            {
                even=false;
            }
        }
        return even;
    }
    public static void rangeEven(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(isEven(i))
            {
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void rangeOdd(int n)
    {
        for(int i=1;i<=n;i++)
    {
        if(isEven(i)==false)
        {
            System.out.print(i +" ");
        }
    }
        System.out.println();

    }

    public static void main(String[] args)
    {
        rangeEven(100);
        rangeOdd(100);
    }
}
