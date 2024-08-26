import java.util.Scanner;
import java.util.Stack;

public class StackAtBottom {
    public static void pushAtBottom(Stack<Integer> s1,int i,int x)
    {
        Stack<Integer> s2=new Stack<>();
        while(s1.size()>i)
        {
            s2.push(s1.pop());
        }
        s1.push(x);
        while(s2.size()>0)
        {
            s1.push(s2.pop());
        }
        System.out.println(s1);
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        System.out.println("enter the size");
        int n=x.nextInt();
        for(int i=1;i<=n;i++)
        {
            int y=x.nextInt();
            s.push(y);

        }
        pushAtBottom(s,2,56);
    }

}
