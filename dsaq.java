import java.sql.SQLOutput;

public class dsaq {

    static class Qeue
    {
        static int a[];
        static int size;
        static int rear;
        Qeue(int n)
        {
            a=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty()
        {
            return rear==-1;
        }
        //add:-
        public static void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("full");
                return;
            }
            rear=rear+1;
            a[rear]=data;
        }
        //remoove:-
        public static int remove()
        {
            if(rear==-1)
            {
                System.out.println("empty");
                return -1;
            }
            int front=a[0];
            for(int i=0;i<rear;i++)
            {
                a[i]=a[i+1];
            }
            rear=rear-1;
            return front;
        }
        //peek:-
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("empty....");
                return -1;
            }
            return a[0];
        }

    }
    public static void main(String[] args)
    {
        Qeue q= new Qeue(5);
        q.add(6);
        q.add(6);
        q.add(8);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
