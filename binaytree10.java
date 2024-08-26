import javax.management.NotificationEmitter;

public class binaytree10 {

    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int trasform(Node root)
    {
        int lc=trasform(root.left);
        int rc=trasform(root.right);
        int data=root.data;
        int nl=root.left==null?0:root.left.data;
        int nr=root.right==null?0:root.right.data;
        root.data=nl+lc+nr+rc;
        return data;

    }
    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args)
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
       int ans= trasform(root);
        preOrder(root);
        System.out.println(ans);
    }
}
