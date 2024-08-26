public class Recursion2 {
    public static int pow(int p ,int q)
    {
        if(q==0)
        {
            return 1;
        }
        return p*pow(p,q-1);
    }
    public static void main(String[] args)
    {
        int ans=pow(5,4);
        System.out.println(ans);
    }
}
