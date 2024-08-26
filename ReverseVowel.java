public class ReverseVowel {
    public static String reverseVowels(String s)
    {
        int n=s.length();
        char ch[]=s.toCharArray();
        int i=0;
        int e=n-1;
        while(i<e)
        {
            if(!isVowel(ch[i]))
            {
                i++;
            }
            else if(!isVowel(ch[e]))
            {
                e--;
            }
            else {
                char t=ch[i];
                ch[i]=ch[e];
                ch[e]=t;
                i++;
                e--;
            }

        }
        return String.valueOf(ch);

    }
    public static boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e'|| ch=='i' ||  ch=='o'|| ch=='u'|| ch=='A'|| ch=='E' || ch=='I'|| ch=='O'||ch=='U')
        {
            return true;
        }
        return false;
    }
    public static void main(String [] args)
    {
        String ans=reverseVowels("shivam");
        System.out.println(ans);
    }
}
