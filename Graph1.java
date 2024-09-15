public class Graph1 {
   static int a[][];
    Graph1(int nodes)
    {
        this.a=new int[nodes][nodes];
    }
    public void addEdge(int u,int v)
    {
        this.a[u][v]=1;
        this.a[v][u]=1;
    }

    public static void main(String[] args) {
        Graph1 g=new Graph1(3);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(0,2);

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
