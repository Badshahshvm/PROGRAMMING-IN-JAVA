public class BinaryTreeJava {
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
    public static void display(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+"->");
        if(root.left!=null)
            System.out.print(root.left.data+",");
        if(root.right!=null)
        {
            System.out.print(root.right.data);
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(3);
        root.right=new Node(4);
        root.left.left=new Node(12);
        root.left.right=new Node(10);
        root.right.right=new Node(7);
        display(root);

    }
}
