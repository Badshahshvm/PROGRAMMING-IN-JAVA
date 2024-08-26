import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElements {
    public static void main(String[] args) {
        Queue<Integer> q1=new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        int k=3;
       Stack<Integer> s= new Stack<>();
        while(q1.size()<=k)
        {
            s.push(q1.remove());
        }
        while(s.size()>0)
        {
            q1.add(s.pop());
        }
        System.out.println(q1);
    }
}
