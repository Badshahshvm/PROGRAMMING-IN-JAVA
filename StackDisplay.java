import java.util.Scanner;
import java.util.Stack;

public class StackDisplay {

    public static void displyStack(Stack<Integer> s)
    {
        Stack<Integer> s1=new Stack<>();
        while(s.size()>0)
        {
            s1.push(s.pop());
            s1.peek();
        }
        while(s1.size()>0)
        {
            s.push(s1.pop());
        }
        System.out.println(s);
    }
    public static void displayStackArray(Stack<Integer> s)
    {
        int a[]=new int[s.size()];
        for(int i=s.size()-1;i>=0;i--)
        {
            a[i]=s.pop();
        }
        for(int i=0;i<s.size();i++)
        {
            System.out.print(a[i]+" ");
            s.push(a[i]);
        }

    }
    public static void printStackRec(Stack<Integer> s)
    {

        if(s.size()==0)
        {
            return;
        }
        int top=s.pop();
        System.out.print(top+" ");
        printStackRec(s);
        s.push(top);
    }
    public static void printStackSame(Stack<Integer> s)
    {
        if(s.size()==0)
        {
            return;
        }
        int top=s.pop();

        printStackRec(s);
        System.out.print(top+" ");
        s.push(top);
    }
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the size:-");
        int n=x.nextInt();
        Stack<Integer> s=new Stack<>();
        for(int i=1;i<=n;i++)
        {
            int p=x.nextInt();
            s.push(p);

        }

      printStackRec(s);
        System.out.println();
        printStackSame(s);
    }
}
