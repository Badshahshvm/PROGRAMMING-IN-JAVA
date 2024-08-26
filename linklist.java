import java.util.LinkedList;
import java.util.Scanner;

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
    Node head=null;
    public void creation()
    {
                Scanner x=new Scanner(System.in);
                int data,n;
                do {
                System.out.println("enter the value:");
                data=x.nextInt();
                Node n1=new Node(data);
                if(head==null)
                {
                    head=n1;
                }
                else {
                    n1.next=head;
                    head=n1;
                }
                System.out.println("if you wan to add more data..the press 1...");
                n=x.nextInt();
            }
        while(n==1);
        }
        public void traverser()
        {
            Node temp=head;
            if(head==null)
            {
                System.out.println("does not exist:");
            }
            else {
                while(temp != null)
                {
                    System.out.print(temp.data +" ");
                    temp=temp.next;
                }
            }
        }

    public static void main(String[] args)
    {
        linklist first=new linklist();
        first.creation();
        first.traverser();
    }

    }

