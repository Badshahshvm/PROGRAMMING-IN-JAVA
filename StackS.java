import java.util.Scanner;
import java.util.Stack;

public class StackS {
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the size");
        int n=x.nextInt();
        Stack<Integer> s1=new Stack<>();
        for(int i=1;i<=n;i++)
        { int t=x.nextInt();
            s1.add(t);
        }
        System.out.println(s1);
        //Reverse the Stack:-
        Stack<Integer> s2=new Stack<>();
        while(s1.size()>0)
        {
            int p=s1.peek();
            s2.push(p);
            s1.pop();

        }
        System.out.println(s2);
        //copy of element from one stack to another stack:-
        Stack<Integer> s3=new Stack<>();
        while(s2.size()>0)
        {
            s3.add(s2.pop());
        }
        System.out.println(s3);
    }
}
