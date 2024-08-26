public class BtoD {
   static class Node
    {
        int data;
        Node next;
      public  Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static int digit(Node head)
    {
        Node temp=head;
        int ans=0;
        while(temp!=null)
        {
            ans*=2;
            ans+=temp.data;
            temp=temp.next;

        }
        return ans;

    }
    public static void main(String[] args)
    {
        Node head=new Node(1);
        head.next=new Node(0);
        head.next.next=new Node(1);
        int ans=digit(head);
        System.out.println(ans);

    }
}
