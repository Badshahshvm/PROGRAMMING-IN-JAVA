public class BinaryTreeHeight {
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
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);
    }

    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(7);
        root.right=new Node(18);
        root.left.right=new Node(20);
        root.right.right=new Node(10);
        root.right.right.left=new Node(17);
        int nas=height(root);
        System.out.println(nas);
    }
}
