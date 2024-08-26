import java.util.Scanner;

public class compress {
    public static String compress(String str)
    {
        String s1="";
        Integer count=1;
        for(int i=0;i<str.length();i++)
        {
         while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) )
         {
             count++;
             i++;
         }
         s1+=str.charAt(i);
         if(count>1)
         {
             s1+=count.toString();
         }

        }


    return s1;
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        String str;
        System.out.println("enter the string ");
        str=x.next();
        System.out.println(compress(str));
    }
}
