import java.util.LinkedList;
import java.util.Stack;

public class Graph2 {
    private LinkedList<Integer>[] adj;
    private int V;// number of vertex 
    private int E; //number of Edge

    public Graph2(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for(int v=0; v<V; v++){
            adj[v] = new LinkedList<>();
        }
    }

    //Add Edge function
    public void addEdge(int u,int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Vertecis " + V + " and Edges are " + E + "\n");
        for(int v=0; v<V; v++){
            sb.append(v +" : ");
            for ( int w : adj[v]) {
                sb.append(w +" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    //Implementation of BFS Traversal
    public void bfsTraversal(int s){
        LinkedList<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];

        visited[s] = true;
        queue.add(s);

        while(!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");

            for(int v : adj[u]){
                if(!visited[v]){
                    visited[v] = true;
                    queue.add(v);
                }
            } 
        }

    }

    // implementation of DfS Traversal 
    public void dfsTraversal(int s){
        Stack<Integer> stack = new Stack<>();
        boolean visit[] = new boolean[V];
        visit[s] = true;
        stack.push(s);
        
        while(!stack.isEmpty()){
            int u = stack.pop();
            System.out.print(u + " ");

            for(int v : adj[u]){
                if(!visit[v]){
                    visit[v] = true;
                    stack.push(v);
                }
            }
        }


    }
    public static void main(String args[]){
        Graph2 g = new Graph2(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.addEdge(4, 6);

        //System.out.println(g);
        System.out.println("Bfs traversal ");
        g.bfsTraversal(1);
        System.out.println("\n");

        System.out.println("DFS traversal ");
        g.dfsTraversal(1);
        System.out.println("\n");


    }
    
    
}
