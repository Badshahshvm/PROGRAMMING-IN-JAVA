import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueInterleavesChange {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        int n=q.size()/2;
        System.out.println(n);
        for(int i=1;i<=n;i++)
        {
            s.push(q.remove());
        }

        while(s.size()>0)
        {
            q.add(s.pop());
        }
        for(int i=1;i<=n;i++)
        {
            s.push(q.remove());
        }
        for(int i=1;i<=n;i++)
        {
            q.add(s.pop());
            q.add(q.remove());
        }

        //reverse the queue;
        while(q.size()>0)
        {
            s.push(q.remove());
        }
        while(s.size()>0)
        {
            q.add(s.pop());
        }
        System.out.println(q);





    }
}
