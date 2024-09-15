public class CountSetBitsInString {
    public static boolean isCheck(int n,int i)
    {
        int ans=n&(1<<i);
        if(ans==0)
        {
            return false;
        }
        return true;
    }
    public static String countSetBits(String ans)
    {
        int val=Integer.parseInt(ans);
        int count=0;
        for(int i=0;i<32;i++)
        {
            if(isCheck(val,i))
            {
                count++;
            }
        }
        String s=String.valueOf(count);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits("11"));
        String binary=Integer.toBinaryString(5);
        System.out.println(binary);

    }
}
