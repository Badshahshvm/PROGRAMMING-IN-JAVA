import java.security.DrbgParameters;
import java.util.Scanner;

public class _linklist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head=null;
        public void creation()
        {
            Scanner x=new Scanner(System.in);
            int n,i,p,m,data;
            do {
                System.out.println("enter data");
                data=x.nextInt();
                Node n1=new Node(data);
                if(head==null)
                {
                    head=n1;

                }
                else {
                    System.out.println("enter 1 to insert the beginning, enter 2 to insert the last, enter 3 to insert at specific positio");
                   p=x.nextInt();
                   switch(p)
                   {
                       case 1:
                           n1.next=head;
                           head=n1;
                           break;
                       case 2:
                           Node end=head;
                           while(end.next!=null)
                           {
                               end=end.next;
                           }
                           end.next=n1;
                           break;
                       case 3:
                           Node s=head;
                           System.out.println("enter the specific position:");
                           m=x.nextInt();
                           for(i=0;i<m-1;i++)
                           {
                               s=s.next;
                           }
                           n1.next=s.next;
                           s.next=n1;
                           break;
                   }
                }
                System.out.println("do you want to add more data...press 1....");
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
            else
            {
                while(temp !=null)
                {
                    System.out.println(temp.next +" ");
                    temp=temp.next;
                }
            }

        }

    public static void main(String[] args)
    {
        _linklist l1=new  _linklist();
        l1.creation();
        l1.traverser();
    }
    }

