public class linklist {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public  void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public int search(int key)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public  void disPlay()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.print("empty"+" ");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public int delete(int n)
    {
        if(head==null)
        {
            return -1;
        }
        if(n==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        return val;

    }
    public void reverse()
    {
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public int nthNode(int n)
    {
        int s=0;
        Node temp=head;
        while(temp!=null)
        {
            s++;
            temp=temp.next;

        }
        temp=head;
        int a=(s-n+1);
        for(int i=1;i<=a-1;i++)
        {
            temp=temp.next;
        }
        return temp.data;
    }
    public static void main(String[] args)
    {
        linklist list=new linklist();
        list.addFirst(40);
        list.addFirst(56);
        list.addFirst(67);
        list.addFirst(44);
        list.addFirst(89);
        System.out.println();
        list.disPlay();
        System.out.println();
        System.out.println(list.search(40));
        System.out.println();
        list.reverse();
        list.disPlay();
        System.out.println();
        System.out.println(list.nthNode(2));
    }
}
