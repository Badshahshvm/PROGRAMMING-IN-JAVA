import java.lang.reflect.Array;
import java.util.ArrayList;

public class binarytree7 {



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

    public static boolean getPath(Node root, int n, ArrayList<Node> path)
    {
        if(root==null)
        {
            return false;
        }

        path.add(root);
        if(root.data==n)
        {
            return false;
        }
        boolean leftF=getPath(root.left,n,path);
        boolean rightF=getPath(root.right,n,path);
        if(leftF || rightF)
        {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root, int n1,int n2)
    {
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        getPath(root,n1,path1);
        getPath(root,n2,path2);
        //last comman ancestors:-
        int i=0;
        for( ;i< path1.size() && i<path2.size();i++)
        {
            if(path1.get(i)!=path2.get(i))
            {
                break;
            }
        }
        //last equal node:-
        Node lca=path1.get(i-1);
        return lca;

    }
    public static void main(String[] args)
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        System.out.println(lca(root, 4,6).data);
    }
}
