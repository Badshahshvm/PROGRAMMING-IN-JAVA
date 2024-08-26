import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeVerticalOrderTraversal {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static int height(Node root)
    {
        if(root==null ||(root.left==null && root.right==null))
            return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void nthLevel(Node root, int n)
    {
        if(root==null)
        {
            return;
        }
        if(n==1)
        {
            System.out.print(root.data+" ");
            return;

        }

        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static Node constructTree(String[] arr)
    {


        int x=Integer.parseInt(arr[0]);
        int n=arr.length;
         Node root=new Node(x);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<n-1)
        {
            Node temp=q.remove();
            Node left=new Node(0);
            Node right=new Node(0);
            if(arr[i].equals(""))
            {
                left=null;
            }
            else
            {
                int l=Integer.parseInt(arr[i]);
                left.data=l;
                q.add(left);
            }
            if(arr[i+1].equals(""))
            {
                right=null;
            }
            else {
                int r=Integer.parseInt(arr[i+1]);
                right.data=r;
                q.add(right);
            }
            temp.left=left;
            temp.right=right;
            i+=2;


        }
        return root;
    }
    public static int leftNode(Node root)
    {
        if(root==null)
            return 0;
        return 1+leftNode(root.left);
    }

    public static int rightNode(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1+rightNode(root.right);
    }
    public static void printVertical(Node root, int currlevel, int s)
    {
        if(root==null) {
            return;
        }
        if(s==currlevel)
        {
            System.out.print(root.data);

        }
        printVertical(root.left,currlevel,s-1);
        printVertical(root.right,currlevel,s+1);
    }
    public static void main(String[] args) {
        String str[]={"1","2","3","4","5","6","7"};
        Node root=constructTree(str);
        int level=height(root)+1;

        int ln=leftNode(root);//3 0 to -2
        int rn=rightNode(root);
        for(int i=1-ln;i<rn;i++)
        {
        printVertical(root,i,0);
            System.out.println();
        }
    }
}
