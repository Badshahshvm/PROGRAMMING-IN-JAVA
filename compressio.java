public class compressio {

    public static String convert(String str)
    {
        String s="";
        for(int i=0;i<str.length();i++)

        {  Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            s=s+str.charAt(i);
            if(count>1)
            {
               s = s+count.toString();
            }
        }
        return s;
    }

    public static void main(String[] args)
    {
        String str="aaabbccddef";
        String S=convert(str);
        System.out.println(S);
    }
}
