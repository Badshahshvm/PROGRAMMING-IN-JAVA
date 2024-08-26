public class CollegeWallahLinkedList {
    public static class Node
    {
        char ch;
        Node next;
        Node(char ch)
        {
            this.ch=ch;

        }
    }
    public static void display(Node head )
    {
        if(head==null)
        {
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.ch+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int  search(Node head, char ch)
    {

        Node temp=head;
        int i=0;
        while(temp!=null )
        {

            if(temp.ch==ch)
            {
                return i;
            }

          temp=temp.next;
            i++;



        }
        return -1;
    }
    public static void delete(Node head, int s)
    {
        if(head==null)
        {
            return;
        }

        Node temp=head;
        for(int i=1;i<=s-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public static void main(String[]args)
    {
        Node head=new Node('a');
        head.next=new Node('b');
        head.next.next=new Node('x');
        head.next.next.next=new Node('d');
        display(head);
        System.out.println();
        int ans=search(head,'x');
        System.out.println(ans);
        delete(head,ans);
        display(head);
    }
}
