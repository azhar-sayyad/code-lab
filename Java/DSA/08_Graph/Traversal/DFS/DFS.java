import java.util.*;

class Graph{
    int[][] mat;
    int size;

    public Graph(int size){
        this.mat = new int[size][size];
        this.size = size;
    }

    private boolean isValidVertex(int v){
        return v >=0 && v < size;
    }

    public void addEdge(int src, int dest){
        if (!isValidVertex(src) || !isValidVertex(dest)) {
            System.out.println("Invalid vertices: (" + src + ", " + dest + "). Must be between 0 and " + (size - 1));
            return;
        }
        mat[src][dest] = 1;
        mat[dest][src] = 1;
    }


    // using loop and stack 
    public void dfs(int src){
        int[] visited = new int[size];
        Stack<Integer> stack = new Stack<>();
        stack.push(src);

        while(!stack.isEmpty()){
            int val = stack.pop();

            if(visited[val] == 0){
                System.out.print(val+" -> ");
                visited[val] = 1;
            }
            for(int i =0; i<size; i++){
                if(mat[val][i] == 1 && visited[i] == 0){
                    stack.push(i);
                }
            }
        }

    }
}

class DFS{
    public static void main(String args[]){
        Graph g = new Graph(6);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(5,3);
        g.addEdge(5,4);
        g.dfs(0);
    }
}
