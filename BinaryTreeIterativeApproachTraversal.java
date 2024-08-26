public class BinaryTreeIterativeApproachTraversal {
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
    public static void nthLevel(Node root, int n)
    {
        if(root==null)
            return;
        if(n==1)
        {
            System.out.print(root.data+" ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static void nthLevel2(Node root, int n)
    {
        if(root==null)
            return;
        if(n==1)
        {
            System.out.print(root.data+" ");
            return;
        }
        nthLevel2(root.right,n-1);
        nthLevel2(root.left,n-1);
    }
public static int level(Node root)
{
    if(root==null)
    {
        return 0;
    }
    int lh=level(root.left);
    int rh=level(root.right);
    return Math.max(lh,rh)+1;
}
    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(4);
        root.right=new Node(8);
        root.left.left=new Node(12);
        root.right.left=new Node(32);
        root.right.left.right=new Node(45);
        int level=level(root)+1;
        System.out.println();
     for(int i=1;i<=level;i++)
     {
         if(i%2!=0)
         {
             nthLevel(root,i);
         }
         else {
             nthLevel2(root,i);
         }
         System.out.println();
     }
    }
}
