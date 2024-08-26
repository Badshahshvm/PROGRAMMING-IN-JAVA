import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static  void levelOrder(Node root)
    {
        Queue<Node> q=new LinkedList<>();

        if(root!=null)
        {
            q.add(root);
        }
        while(q.size()>0)
        {
            Node temp=q.peek();
            if(temp!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
            System.out.print(temp.data+" ");
            q.remove();
        }
    }

    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(3);
        root.right=new Node(4);
        root.left.left=new Node(12);
        root.left.right=new Node(10);
        root.right.right=new Node(7);
     preOrder(root);
     postOrder(root);
        System.out.println();
     inOrder(root);
        System.out.println();
        levelOrder(root);
    }
}
