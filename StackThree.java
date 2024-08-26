import java.util.Scanner;
import java.util.Stack;

public class StackThree {
    public static void pushAtBottom(Stack<Integer> s,int x)
    {
        if(s.size()==0)
        {
            s.push(x);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,x);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s)
    { if(s.size()==1)
    {
        return;
    }
        int t=s.pop();
        reverseStack(s);
        pushAtBottom(s,t);
    }
    public static void main(String[] args)
    {

        Scanner x=new Scanner(System.in);
        System.out.println("enter the size:-");
        int n=x.nextInt();
        Stack<Integer> s=new Stack<>();
        for(int i=1;i<=n;i++)
        {
            int y=x.nextInt();
            s.push(y);
        }
        reverseStack(s);
        System.out.println(s);

    }
}
