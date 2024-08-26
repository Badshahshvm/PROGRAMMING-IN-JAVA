public class Graph {
    int m[][];
    Graph(int n)
    {
        m=new int[n][n];
    }
    public void addEdges(int a[][], boolean isDirected)
    {
        for(int e[]:a)
        {
            int u=e[0];
            int v=e[1];
            if(isDirected)
            {
                m[u][v]=1;
            }
            else {
                m[u][v]=1;
                m[v][u]=1;
            }
        }
    }
    public void addEdgesWithWeight(int a[][], boolean isDirected)
    {
        for(int e[]:a)
        {
            int u=e[0];
            int v=e[1];
            int w=e[2];
            if(isDirected)
            {
                m[u][v]=w;
            }
            else {
                m[u][v]=w;
                m[v][u]=w;
            }
        }
    }

    public void printEdge()
    {
        int n=m.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(i+"->");
            for(int j=0;j<n;j++)
            {
                System.out.print(m[i][j]+",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int edges[][]={{0,2},{0,1},{0,3}};
        int b[][]={{0,1,20},{0,3,40},{0,2,10}};
        int n=4;
        Graph g=new Graph(n);
        g.addEdges(edges,false);
        g.addEdgesWithWeight(b,false);
        g.printEdge();
        System.out.println();
        g.printEdge();
    }
}
