import java.util.Scanner;
import java.util.Stack;

public class DleteStackAt {


    public static void deleteAtAnyIndex(Stack<Integer> s,int i)
    {
        Stack<Integer> s1=new Stack<>();
        while(s.size()>i)
        {
            s1.push(s.pop());
        }
        s.pop();
        while(s1.size()>0)
        {
            s.push(s1.pop());
        }
        System.out.println(s);
    }
    public static void main(String[] args)
    {   Scanner x=new Scanner(System.in);
        System.out.println("enter the size-");
        int n=x.nextInt();
        Stack<Integer> s=new Stack<>();
        for(int i=1;i<=n;i++)
        {
            int p=x.nextInt();
            s.push(p);
        }
        deleteAtAnyIndex(s,3);

    }
}
