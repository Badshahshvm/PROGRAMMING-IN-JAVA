public class removeWhiteSpace {
    public static String removeWhite(String s)
    {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(Character.isWhitespace(ch)==false)
            {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String ans="My ansme is Shivam";
        String a=removeWhite(ans);
        System.out.println(a);

    }
}
