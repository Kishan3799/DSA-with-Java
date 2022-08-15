public class Graph {
    private int adjMatrix[][];
    private int vertex;//no of vertices

    //Graph constructor
    public Graph (int vertex) {
        this.vertex = vertex;
        adjMatrix = new int[vertex][vertex];
    }

    //add Edge in graph
    public void addEdge(int sorc, int dest){
        //add edge
        adjMatrix[sorc][dest] = 1;
        //add edge in back in undirected graph
        adjMatrix[dest][sorc] = 1;
    }
    //remove Edge in graph
    public void removeEdge(int sorc, int dest){
        adjMatrix[sorc][dest] = 0;
        adjMatrix[dest][sorc] = 0;
    }

    public int isEdge (int sorc , int dest){
        if(sorc>=0 && sorc<vertex && dest>0 && dest<vertex)
            return adjMatrix[sorc][dest];
        else
            return 0;
    }

    //print grap 
    public void printGrpah( ) {
        System.out.println("Adjacency matrix");
        for(int i=0; i<vertex; i++){
            for(int j=0; j<vertex; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Connection of edges :");
        for(int i= 0; i<vertex; i++){
            System.out.println("Vertex " + i + " is connected to :");
                for(int j=0; j<vertex; j++){
                    if(adjMatrix[i][j] == 1) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }

    //Implement BFS Traversal Algorithm
   
    

    public static void main(String[] args) {

      //  Adjacency Matrix
        Graph gr = new Graph(7);

        gr.addEdge(0, 1);
        gr.addEdge(0, 2);
        gr.addEdge(0, 3);
        gr.addEdge(1, 2);
        gr.addEdge(2, 3);
        gr.addEdge(3, 4);
        gr.addEdge(4, 2);
        gr.addEdge(4, 5);
        gr.addEdge(4, 6);
        
        System.out.println( gr.isEdge(3, 4));
        gr.printGrpah();

        


    }
}