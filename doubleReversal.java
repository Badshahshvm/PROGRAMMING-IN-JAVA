public class doubleReversal {

    public static boolean doubleReversal(int num)
    {
        int temp=num;
        while(num>0)
        {
            int r=num%10;
            if(r==0 && temp==num)
            {
                return false;
            }
            num=num/10;
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(doubleReversal(526));
        System.out.println(doubleReversal(398));
        System.out.println(doubleReversal(1400));
    }
}
