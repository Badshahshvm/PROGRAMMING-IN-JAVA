public class mehtod {
    static int logic(int x, int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
            z=(x+y)*5;
        return z;
    }
    public static void main(String[] args)
    {
        int a=5;
        int b=9;
        int c;
        c=logic(a,b);
        System.out.println(c);
        int a1=2;
        int b1=1;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);
        int a2=5;
        int b2=18;
        int c2;
        c2=logic(a2,b2);
        System.out.println(c2);
    }

}
