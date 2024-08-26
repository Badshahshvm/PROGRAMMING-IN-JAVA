import java.util.Scanner;
import java.util.Stack;

public class dsas2 {

    public static String reverseString(String str)
    {
        Stack<Character> s =new Stack<>();
        int i=0;
        while(i<str.length())
        {
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty())
        {
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter the string..");
        str=sc.nextLine();
        String ans=reverseString(str);
        System.out.println(ans);
    }
}
