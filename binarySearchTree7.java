public class binarySearchTree7 {

    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static Node createBST(int a[],int s,int end)
    {
        if(s>end)
        {
            return null;
        }
        int mid=(s+end)/2;
        Node root=new Node(a[mid]);
        root.left=createBST(a,s,mid-1);
        root.right=createBST(a,mid+1,end);
        return root;
    }

    public static void main(String[] args)
    {
        int a[]={3,5,6,8,10,11,12};
        Node root=createBST(a,0,a.length-1);
        preOrder(root);
    }
}
