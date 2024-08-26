public class DoubleLinkedList {
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
    public static void display(Node head)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail)
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
           temp=temp.prev;
        }
        System.out.println();
    }
    public static Node insertAtHead(int d,Node n)
    {
        Node t=new Node(d);
        t.next=n;
        n.prev=t;
        n=t;
        return n;

    }
    public static void insertAtTail(int x, Node n)
    {
        Node temp=n;
        while(temp!=null)
        {
            temp=temp.next;
        }
        Node newNode=new Node(x);
        temp.next=newNode;
        newNode.prev=temp;
        temp=newNode;


    }
    public static void insertAtIndex(int x,Node head ,int idx)
    {
        Node temp=head;
        if(head==null){
            return;
        }
        for(int i=1;i<idx-1;i++)
        {
            temp=temp.next;
        }
        Node r=temp.next;
Node t=new Node(x);
temp.next=t;
t.prev=temp;
t.next=r;
r.prev=t;

    }


    public static void main(String[] args)
    {
        Node a=new Node(12);
        Node b=new Node(13);
        Node c=new Node(14);
        Node d=new Node(15);
        Node e=new Node(16);
        Node f=new Node(17);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=f;
        f.prev=e;
        f.next=null;
        display(a);
        System.out.println();
        displayrev(f);
        Node ans=insertAtHead(34,a);
        display(ans);
        insertAtTail(23,ans);
        display(ans);
        System.out.println();
        insertAtIndex(35,a,3);
        display(a);

    }
}
