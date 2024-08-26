public class TwoSumDoublyLinkedList {
    public static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static int isFind(Node head, int target)
    {
        Node t=head;
        Node h=head;
        while(t.next!=null)
        {
            t=t.next;
        }
        while(h.data<t.data)
        {
            if(h.data+t.data==target)
            {

                return 1;
            }
            else if(h.data+t.data>target)
            {
                t=t.prev;
            }
            else {
                h=h.next;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(14);
        Node c=new Node(15);
        Node d=new Node(16);
        Node e=new Node(18);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        int ans=isFind(a,34);
        System.out.println(ans);

    }
}
