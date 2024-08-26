public class deleteTree {

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
    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;

        }
        if(root.data<val)
        {
            root.right=insert(root.right,val);
        }
        else {
            root.left=insert(root.left,val);
        }
        return root;
    }
    public static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static Node delete(Node root,int k)
    {
        if(root.data>k)
        {
            root.left=delete(root.left,k);
        }
        else if(root.data<k) {
            root.right=delete(root.right,k);

    }
        else {
            if(root.left==null && root.right==null)
            {
                return null;
            }
            if(root.right==null)
            {
                return root.left;
            }
            if(root.left==null)
            {
                return root.right;
            }
            Node Is=findInOderPrecessor(root.right);
            root.data=Is.data;
            delete(root.right,Is.data);
        }
        return root;
    }
    public static Node findInOderPrecessor(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
    public static void printInRange(Node root,int k1, int k2)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>=k1 && root.data<k2)
        {
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }
        else if(root.data<k1)
        {
            printInRange(root.left,k1,k2);
        }
        else
        {
            printInRange(root.right,k1,k2);
        }
    }
    public static void main(String[] args)
    {
        int values[]={8,5,10,3,6,11,3,6,14,1,4};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();
        findInOderPrecessor(root);
        inOrder(root);
        System.out.println();
        printInRange(root,3,11);
    }

}
