// import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GraphColoringCSP {
    private int maxColors;
    private Map<Integer, Integer> assignment;
    private Map<Integer, List<Integer>> graph;

    public GraphColoringCSP(int maxColors, Map<Integer, List<Integer>> graph) {
        this.maxColors = maxColors;
        this.graph = graph;
        this.assignment = new HashMap<>();
    }

    public Map<Integer, Integer> solve() {
        return backtrack() ? assignment : null;
    }

    private boolean backtrack() {
        if (assignment.size() == graph.size()) {
            // All nodes are colored
            return true;
        }

        int uncoloredNode = selectUnassignedNode();
        for (int color = 1; color <= maxColors; color++) {
            if (isColorValid(uncoloredNode, color)) {
                assignment.put(uncoloredNode, color);
                if (backtrack()) {
                    return true;
                }
                assignment.remove(uncoloredNode);
            }
        }

        return false;
    }

    private int selectUnassignedNode() {
        for (int node : graph.keySet()) {
            if (!assignment.containsKey(node)) {
                return node;
            }
        }
        return -1; // All nodes are assigned colors
    }

    private boolean isColorValid(int node, int color) {
        List<Integer> neighbors = graph.get(node);
        if (neighbors == null) {
            return true; // Node has no neighbors
        }

        for (int neighbor : neighbors) {
            if (assignment.containsKey(neighbor) && assignment.get(neighbor) == color) {
                return false; // Color is already used by a neighbor
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example graph represented as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, List.of(2, 3));
        graph.put(2, List.of(1, 3, 4));
        graph.put(3, List.of(1, 2, 4));
        graph.put(4, List.of(2, 3));

        int maxColors = 3; // Maximum number of colors allowed

        GraphColoringCSP csp = new GraphColoringCSP(maxColors, graph);
        Map<Integer, Integer> coloring = csp.solve();

        if (coloring != null) {
            System.out.println("Solution found:");
            System.out.println(coloring);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
