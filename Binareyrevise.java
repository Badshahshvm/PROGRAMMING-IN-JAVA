public class Binareyrevise {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   static class Bin
    {
        static int i = -1;
        public static Node buildTree( int nodes[])
        {
            i++;
            if(nodes[i]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[i]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
 public static void main(String[] args)
 {
     int nodes[]={1,2,4,5,3,6};
     Bin t=new Bin();
     Node root=t.buildTree(nodes);
     System.out.println(root.data);
 }
}
