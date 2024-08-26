public class Accenture {
    public static String makeString(int k, String s)
    {
        String ans="";
        while(k-->0)
        {
            ans+=s;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(makeString(3,"abc"));

    }
}
