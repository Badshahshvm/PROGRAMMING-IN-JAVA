import java.util.Stack;

public class dsas {
    public static void pushBottom(Stack<Integer> s,  int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBottom(s,data);
         s.push(top);
    }

    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(45);
        s.push(78);
        s.push(12);
        pushBottom(s,98);
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
}
