public class binarytree3 {

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


    //count the node:-
    public static int countNode(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int ln=countNode(root.left);
        int rn=countNode(root.right);
        return ln+rn+1;
    }
    public static void main(String[] args)
    {

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        System.out.println(countNode(root));
    }

}
