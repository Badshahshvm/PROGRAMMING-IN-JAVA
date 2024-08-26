public class isPalindrome {


    public static boolean checkPalindrome(String s)
    {
        if(s.equals(reverse(s)))
        {
            return true;
        }
        return false;

    }
    public static String reverse(String s)
    {
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            r+=s.charAt(i);
        }
        return r;

    }

    public static void main(String[] args)
    {
        boolean ans=checkPalindrome("shivam");
        System.out.println(ans);
        boolean a1=checkPalindrome("noon");
        System.out.println(a1);

    }
}
