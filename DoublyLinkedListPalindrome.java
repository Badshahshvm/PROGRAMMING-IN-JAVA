public class DoublyLinkedListPalindrome {
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
    public static boolean isPalindrome(Node head)
    {
        Node t=head;
        Node h=head;
        while(t.next!=null)
        {
            t=t.next;
        }
        while(t!=h)
        {
            if(t.data!=h.data)
            {
                return false;
            }
            h=h.next;
            t=t.prev;
        }
        return true;

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
    public static void main(String[] args)
    {

        Node a=new Node(4);
        Node b=new Node(2);
        Node c=new Node(4);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;

        boolean ans=isPalindrome(a);
        System.out.println(ans);

    }


}
