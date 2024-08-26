import java.util.Stack;
import java.util.function.DoubleToIntFunction;

public class dsas4 {
    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }


    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {

            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);


    }



    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(45);
        s.push(78);
        s.push(12);

        reverseStack(s);
        System.out.println();
        printStack(s);
    }
}
