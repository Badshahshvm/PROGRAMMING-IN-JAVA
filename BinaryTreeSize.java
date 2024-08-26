public class BinaryTreeSize {
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
    public static int treeSize(Node root)
    {
        if(root==null)
        {
            return -0;
        }
        return 1+treeSize(root.left)+treeSize(root.right);
    }

    public static void main(String[] args) {
       Node root=new Node(2);
        root.left=new Node(3);
        root.right=new Node(4);
        root.left.left=new Node(12);
        root.left.right=new Node(10);
        root.right.right=new Node(7);
       int nas=treeSize(root);
        System.out.println(nas);
    }
}
