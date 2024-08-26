public class BSTdelete {
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
    public static void delete(Node root, int target)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>target)
        {
            if(root.left.data==target)
            {
                root.left=null;
            }
            else {
                delete(root.left, target);
            }
        }
        //right
        if(root.data<target)
        {
            if(root.right.data==target)
            {
                root.right=null;
            }
            else {
                delete(root.right, target);
            }
        }


    }
    public static void deleteChild(Node root, int target)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>target)
        {
            if(root.left==null)return;
            if(root.left.data==target)
            {
               Node l=root.left;
               if(l.left==null && l.right==null) root.left=null;
               else if(l.left==null || l.right==null)
               {
                   if(l.left!=null) root.left=l.left;
                   else root.left=l.right;
               }
            }
            else {
                deleteChild(root.left, target);
            }
        }
        else {
            if(root.right==null)return;
            if(root.right.data==target)
            {
                Node r=root.right;
                if(r.left==null && r.right==null)
                {
                    root.right=null;
                }
                else if(r.left==null || r.right==null)
                {
                    if(r.right!=null) root.right=r.right;
                    else root.right=r.right;
                }
            }
            else {
                deleteChild(root.right, target);
            }
        }
    }
    public static void deleteTwoChildNode(Node root, int target)
    {


    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(12);
        root.left=new Node(10);
        root.right=new Node(15);
        root.left.left=new Node(6);
        root.left.right=new Node(11);
        root.right.left=new Node(13);
        preorder(root);
        delete(root,13);
        System.out.println();
        preorder(root);
        deleteChild(root, 15);
        System.out.println();
        preorder(root);

    }

}
