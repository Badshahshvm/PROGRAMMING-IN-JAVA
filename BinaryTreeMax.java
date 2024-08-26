public class BinaryTreeMax {
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
    public static int maxNode(Node root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        int a=root.data;
        int b=maxNode(root.left);
        int c=maxNode(root.right);



    return Math.max(a, Math.max(b,c));
    }

    public static void main(String[] args) {
       Node root=new Node(2);
        root.left=new Node(3);
        root.right=new Node(4);
        root.left.left=new Node(12);
        root.left.right=new Node(10);
        root.right.right=new Node(7);
       int ans=maxNode(root);
        System.out.println(ans);

    }
}
