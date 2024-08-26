import java.util.Scanner;

public class consonant {

    public static String printConst(String str)
    {
        String str2 ="";
                for(int i=0;i<str.length();i++)
                {
                    char ch=str.charAt(i);
                    if(ch!='a'|| ch!='e' || ch!='i' || ch!='O'|| ch!='u')
                    {
                        str2=str2+ch;
                    }
                }
                return str2;
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        String ans=printConst("shivam");
        System.out.println(ans);
    }
}
