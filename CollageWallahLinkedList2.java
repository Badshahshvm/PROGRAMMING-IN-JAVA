public class CollageWallahLinkedList2 {

    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void count(Node head)
    {
        Node temp=head;
        int m=0;
        int n=0;
        while(temp!=null)
        {
            if((temp.data)%2==0)
            {
                m++;
            }
            else {
                n++;
            }
            temp=temp.next;
        }
        System.out.print(m+" "+n);

    }
    public static void main(String[] args)
    {
        Node head=new Node(12);
        head.next=new Node(13);
        head.next.next=new Node(50);
        head.next.next.next=new Node(11);
        head.next.next.next.next=new Node(17);
        count(head);
    }

}
