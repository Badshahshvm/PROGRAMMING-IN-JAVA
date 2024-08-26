import java.util.ArrayList;
import java.util.List;

public class InorderPrecessorAndSucessor {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;

        }
    }
    public static void inOrder(Node root, List<Integer> l1)
    {
        if(root==null)
        {
            return;
        }


        inOrder(root.left,l1);
        l1.add(root.data);
        inOrder(root.right,l1);

    }

    public static void main(String[] args) {
        Node root=new Node(15);
        List<Integer> l1=new ArrayList<>();
        inOrder(root,l1);
        int val=28;
        int idx=-1;
        for(int i=0;i<l1.size();i++)
        {
            if(l1.get(i)==val)
            {
                idx=i;
                break;
            }
        }
        int pre=l1.get(idx-1);
        int suc=l1.get(idx+1);

    }
}
