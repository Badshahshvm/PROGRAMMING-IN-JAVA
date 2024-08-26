public class doublell {


    public class Node{
        int data;
        Node next;
        Node  prev;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }


    }
    public static Node head;
    public static Node tail;
    public static  int size;
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            return;
        }
        System.out.println("null");
    }
    public static void main(String[] args)
    {
        doublell d1=new doublell();
        d1.addFirst(23);
        d1.addFirst(67);
        d1.addFirst(89);
        d1.print();


    }
}
