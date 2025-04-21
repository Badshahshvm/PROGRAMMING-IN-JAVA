import java.sql.SQLOutput;

class Node
{
    int val;
    Node next;
    public Node(int val)
    {
        this.val=val;
        this.next=null;
    }
}
public class LinkedListRemove_2 {
    public static int size(Node head)
    {
        Node temp=head;
        int s=0;
        while(temp!=null)
        {
            s++;
            temp=temp.next;
        }
        return s;

    }

    public static Node removeNthAfterMthNode(Node head,int n,int m)
    {
        int s=size(head);
        Node temp=head;

        for(int i=1;i<m & temp!=null;i++)
        {
            temp=temp.next;
        }

        for(int i=0;i<n&& temp!=null && temp.next!=null;i++)
        {
            temp.next=temp.next.next;
        }

        return head;


    }

    public static void printLinkedList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        Node n1=new Node(4);
        n1.next=new Node(5);
        n1.next.next=new Node(6);
        n1.next.next.next=new Node(7);
        System.out.println(size(n1));
        System.out.println();
        printLinkedList(removeNthAfterMthNode(n1,2,2));

    }




}
