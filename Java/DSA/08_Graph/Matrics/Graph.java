/**
 * Adjacency Matrix Representation of a Graph.
 * Supports:
 * - Undirected & Directed edges
 * - Unweighted & Weighted edges
 */

class Graph {
    
    private int[][] mat;
    private int size;

    // Constructor to initialize an n x n adjacency matrix with 0s
    public Graph(int size) {
        this.size = size;
        this.mat = new int[size][size];
    }

    /**
     * Helper to validate vertex indices.
     * In Java, chained comparison (0 <= src < size) must be written with '&&'.
     */
    private boolean isValidVertex(int v) {
        return v >= 0 && v < size;
    }

    /**
     * 1. Add an unweighted, undirected edge (default)
     */
    public void addEdge(int src, int dest) {
        addEdge(src, dest, 1, false);
    }

    /**
     * 2. Add an unweighted edge (choose directed or undirected)
     */
    public void addEdge(int src, int dest, boolean isDirected) {
        addEdge(src, dest, 1, isDirected);
    }

    /**
     * 3. Add a weighted edge (choose directed or undirected)
     */
    public void addEdge(int src, int dest, int weight, boolean isDirected) {
        if (!isValidVertex(src) || !isValidVertex(dest)) {
            System.out.println("Invalid vertices: (" + src + ", " + dest + "). Must be between 0 and " + (size - 1));
            return;
        }

        mat[src][dest] = weight;

        // If undirected, add the reverse edge as well
        if (!isDirected) {
            mat[dest][src] = weight;
        }
    }

    /**
     * Print the adjacency matrix
     */
    public void printMatrix() {
        System.out.println("Adjacency Matrix (" + size + "x" + size + "):");
        
        // Print column headers
        System.out.print("   ");
        for (int j = 0; j < size; j++) {
            System.out.print(j + " ");
        }
        System.out.println("\n  " + "_".repeat(size*2));

        // Print rows
        for (int i = 0; i < size; i++) {
            System.out.print(i + "| ");
            for (int j = 0; j < size; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // --- 1. Undirected Graph Demo ---
        System.out.println("=== 1. Undirected Unweighted Graph ===");
        Graph undirectedGraph = new Graph(4);
        undirectedGraph.addEdge(0, 1); // Edge between 0 and 1
        undirectedGraph.addEdge(1, 2); // Edge between 1 and 2
        undirectedGraph.addEdge(2, 3); // Edge between 2 and 3
        undirectedGraph.printMatrix();

        // --- 2. Directed Graph Demo ---
        System.out.println("=== 2. Directed Unweighted Graph ===");
        Graph directedGraph = new Graph(4);
        directedGraph.addEdge(0, 1, true); // Directed edge: 0 -> 1
        directedGraph.addEdge(1, 2, true); // Directed edge: 1 -> 2
        directedGraph.printMatrix();

        // --- 3. Weighted Graph Demo ---
        System.out.println("=== 3. Weighted Graph ===");
        Graph weightedGraph = new Graph(4);
        // addEdge(src, dest, weight, isDirected)
        weightedGraph.addEdge(0, 1, 5, false);  // Undirected edge with weight 5
        weightedGraph.addEdge(1, 3, 10, true);  // Directed edge: 1 -> 3 with weight 10
        weightedGraph.printMatrix();
    }
}