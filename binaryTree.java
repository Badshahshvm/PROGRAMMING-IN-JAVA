import java.util.LinkedList;
import java.util.Queue;

public class binaryTree {
    static class Node
    {
        int data;
        Node left;
        Node right;
         public Node(int d)
        {
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree
    {
       static  int i=-1;
        public static  Node buildTree(int a[])
        {
            i++;
            if(a[i]==-1)
            {
                return null;
            }
            Node newNode=new Node(a[i]);
            newNode.left=buildTree(a);
            newNode.right=buildTree(a);
            return newNode;
        }
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
    public static void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }
    //calculate the height of tree:-
    public static int height(Node root)
    {
        if(root==null)
        {
            return -1;
        }
        int lh=height(root.left);
        int rh=height(root.right);
         int ans=Math.max(lh,rh)+1;
         return ans;
    }
    //calculate the total no of nodes are present in a binary tree:-
    public static int countNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lc=countNodes(root.left);
        int rc=countNodes(root.right);
        return lc+rc+1;
    }
    public static void main(String[] args)
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println("height of tree is "+height(root));
        System.out.println();
        System.out.println("no of nodes are in binary tree "+ countNodes(root));
    }
}
