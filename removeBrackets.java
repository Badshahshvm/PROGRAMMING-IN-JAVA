public class removeBrackets {
    public  static  String removeBrackets(String s)
    {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==')' || s.charAt(i)=='(')
            {
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String ans="a+((b-c)+d)";
        System.out.println(removeBrackets(ans));

    }
}
