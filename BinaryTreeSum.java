public class BinaryTreeSum {
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
    public static int sumTree(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        return root.data+sumTree(root.left)+sumTree(root.right);
    }

    public static void main(String[] args) {
   Node root=new Node(2);
        root.left=new Node(3);
        root.right=new Node(4);
        root.left.left=new Node(12);
        root.left.right=new Node(10);
        root.right.right=new Node(7);
       int ans=sumTree(root);
        System.out.println(ans);
    }
}
