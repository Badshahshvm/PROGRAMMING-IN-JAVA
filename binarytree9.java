public class binarytree9 {

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
    public static int kAncestor(Node root, int n, int k)
    {
        if(root==null)
        {

            return -1;
        }
        if(root.data==n)
        {
            return 0;
        }
        int lD=kAncestor(root.left, n, k);
        int rD=kAncestor(root.right,n,k);
        if(lD==-1 && rD==-1)
        {
            return -1;
        }

        int max=Math.max(lD,rD);
        if(max+1==k)
        {
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String[] args)
    {
       Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        System.out.println(kAncestor(root,4,2));
    }
}
