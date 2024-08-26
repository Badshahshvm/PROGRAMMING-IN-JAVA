import java.util.Scanner;

public class string {
    public static boolean palindromeString(String word)
    {            int n= word.length();
        for(int i=0;i<n/2;i++)
        {

            if(word.charAt(i)==word.charAt(n-1-i))
            {
                return true;

            }

        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String word;
        System.out.println("enter the word:- ");
        word= sc.nextLine();
        System.out.println(palindromeString(word));


    }
}
