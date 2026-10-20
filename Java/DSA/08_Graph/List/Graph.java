import java.util.*;

/**
 * Adjacency List Representation of a Graph using Map<Integer, List<Integer>>.
 * 
 * Space efficient for sparse graphs: O(V + E)
 */
class Graph {

    // Map each vertex to its list of adjacent neighbors
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    /**
     * Adds a vertex if it doesn't already exist
     */
    public void addVertex(int vertex) {
        graph.putIfAbsent(vertex, new ArrayList<>());
    }

    /**
     * Adds an unweighted, undirected edge (default)
     */
    public void addEdge(int src, int dest) {
        addEdge(src, dest, false);
    }

    /**
     * Adds an unweighted edge (directed or undirected)
     */
    public void addEdge(int src, int dest, boolean isDirected) {
        addVertex(src);
        addVertex(dest);

        // List uses .add(), not .put()
        graph.get(src).add(dest);

        // If undirected, add the reverse connection as well
        if (!isDirected) {
            graph.get(dest).add(src);
        }
    }

    /**
     * Displays the graph representation
     */
    public void display() {
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String args[]) {
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);

        System.out.println("Adjacency List (Undirected):");
        graph.display();
    }
}