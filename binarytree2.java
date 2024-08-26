public class binarytree2 {


    static class Node{
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int heightTree(Node root)
    {
        if(root==null)
        {
            return 0;

        }
        int lh=heightTree(root.left);
        int rh=heightTree(root.right);
        return Math.max(lh ,rh)+1;
    }
    public static void main(String[] args)
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);

        System.out.println(heightTree(root));
    }

}
