import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph3 {
    LinkedList<Integer> adj[];
    int v;
    Graph3(int nodes)
    {
        this.v=nodes;
        adj=new LinkedList[nodes];
        for(int i=0;i<nodes;i++)
        {
            adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int u,int v)
    {
        this.adj[u].add(v);
        this.adj[v].add(u);
    }
    public void printGraph()
    {
        for(int i=0;i<adj.length;i++)
        {
            System.out.print("Vertex " + i + ": ");
            {
                for(int val:adj[i])
                {
                    System.out.print(val+" ");

                }
                System.out.println();
            }
        }
    }
    public void bfs(int s)
    {
        boolean visited[]=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        visited[s]=true;
        while(q.size()>0)
        {
            int u=q.remove();
            System.out.print(u+" ");
            for(int v:adj[u])
            {
                if(!visited[v])
                {
                    visited[v]=true;
                    q.add(v);
                }
            }

        }
    }
    public void dfs(int s)
    {
        Stack<Integer >st=new Stack<>();
        boolean visited[]=new boolean[v];
        st.push(s);
        while(st.size()>0)
        {
            int u=st.pop();
            if(!visited[u])
            {
                visited[u]=true;
                System.out.print(u+" ");
                for(int v:adj[u])
                {
                    st.push(v);
                }
            }

        }
    }

    public static void main(String[] args) {
        Graph3 g=new Graph3(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(3,0);
        g.printGraph();
        g.bfs(0);
        System.out.println();
        g.dfs(0);

    }
}
