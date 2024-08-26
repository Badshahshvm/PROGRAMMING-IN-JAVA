public class LinkedListToStack {
    public static class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }
    public static class LLStack
    {
        Node head=null;
        int size=0;
        void push(int x)
        {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;


        }
        int pop()
        {  if(head==null)
        {
            return -1;
        }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }
        int peek()
        {
            if(head==null)
        {
            return -1;
        }
            return head.val;
        }
        boolean isEmpty()
        {
            if(size==0)
            {
                return true;
            }
            return false;
        }
        void displayrec(Node h)
        {
            if(h==null)
            {
                return;
            }
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display()
        {
            displayrec(head);
        }
        void displayRev()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.val);
                temp=temp.next;
            }
            System.out.println();

        }
       int size()
       {
           return size;
       }
    }
    public static void main(String[] args)
    {
        LLStack s=new LLStack();
        s.push(12);
        s.display();
        System.out.println();
        s.push(23);
        s.display();
        System.out.println();
        s.push(36);
        s.display();
        System.out.println();
        s.peek();
    }
}
