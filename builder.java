public class builder {

    public static void main(String[] args)
    {
        StringBuilder s = new StringBuilder("");
        for(char ch='a';ch<='z';ch++)
        {
            s.append(ch);
        }
        System.out.println(s);
    }
}
