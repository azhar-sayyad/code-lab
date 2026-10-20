import java.util.*;

class Graph{
    int[][] matrix;
    int size;

    public Graph(int size){
        this.matrix = new int[size][size];
        this.size = size;
    }
    private boolean isValidVertex(int v){
        return v >= 0 && v < size;
    }

    public void addEdge(int src, int dest){
        if (!isValidVertex(src) || !isValidVertex(dest)) {
            System.out.println("Invalid vertices: (" + src + ", " + dest + "). Must be between 0 and " + (size - 1));
            return;
        }

        matrix[src][dest] = 1;
        matrix[dest][src] = 1;
    }

    public void bfs(int src){
        int[] visited = new int[size];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);

        while(!queue.isEmpty()){
            int val = queue.remove();
            if(visited[val] == 0){
                System.out.print(val+" -> ");
                visited[val] = 1;
            }

            for(int i=0 ;i<size ; i++){
                if(matrix[val][i] == 1 && visited[i] == 0){
                    queue.add(i);
                }
            }

        }

    }
    
}

class BFS{
    public static void main(String[] args){
        Graph g = new Graph(8);

        g.addEdge(0,1);
        g.addEdge(0,3);
        g.addEdge(3,5);
        g.addEdge(3,4);
        g.addEdge(4,6);
        g.addEdge(6,2);
        g.addEdge(6,7);

        g.bfs(0);
    }
}