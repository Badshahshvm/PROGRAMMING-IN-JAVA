import com.sun.security.jgss.GSSUtil;

public class binarytree5 {



    static class Node {
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
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return lh+rh+1;
    }
    public static int callcDiameter(Node root)
    {
        if(root ==null)
        {
            return 0;
        }
        int ledtD=callcDiameter(root.left);
        int lht=height(root.left);
        int rightD=callcDiameter(root.right);
        int rht=height(root.right);
        int selfD=lht+rht+1;
        return Math.max(selfD, Math.max(ledtD,rightD));



    }
    public static void main(String[] args)
    {

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        System.out.println(callcDiameter(root));
    }

}
