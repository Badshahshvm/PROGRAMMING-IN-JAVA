public class binarytree4 {


    static class Node
    {
        int data;
        Node left,right;

        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    //sum of nodes...
    public static int sumNode(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int ls=sumNode(root.left);
        int rs=sumNode(root.right);
        return ls+rs+root.data;


    }
    public static void main(String[] args)
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        System.out.println(sumNode(root));
    }

}
