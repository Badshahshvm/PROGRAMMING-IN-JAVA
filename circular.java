public class circular {

    public static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
          this.data=d;
          this.next=null;
        }

    }
    public static boolean isCircular(Node head)
    {
        if(head==null)
        {
            return true;

        }
        if(head.next==null)
        {
            return true;
        }
        Node temp=head.next;
        while(temp!=head && temp!=null)
        {
            temp=temp.next;

        }
        if(temp==null)
        {
            return false;

        }
     if(temp==head)
     {
         return true;
     }
     return false;
    }
    public static void main(String[] args)
    {
        Node head=new Node(5);
        head.next=new Node(56);
        head.next.next=new Node(123);
        head.next.next.next=head;
        System.out.println(isCircular(head));
    }
}
