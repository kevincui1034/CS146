import java.util.*;

public class waterSupply {

    private int[] parents;

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        parents = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parents[i] = i;
        }

        List<Edge> edges = new ArrayList<>();

        for (int[] pipe : pipes) {
            edges.add(new Edge(pipe[1] - 1, pipe[2] - 1, pipe[0]));
        }

        for (int i = 0; i < wells.length; i++) {
            edges.add(new Edge(i, n, wells[i]));
        }
        Collections.sort(edges, Comparator.comparingInt(e -> e.cost));

        int ans = 0;
        for (Edge edge : edges) {
            if (union(edge.u, edge.v)) {
                ans += edge.cost;
            }
        }

        return ans;
    }

    private int find(int x) {
        if (x != parents[x]) {
            parents[x] = find(parents[x]);
        }
        return parents[x];
    }

    private boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            parents[rootY] = rootX;
            return true;
        }
        return false;
    }

    private static class Edge {
        int u, v, cost;
        Edge(int u, int v, int cost) {
            this.u = u;
            this.v = v;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        waterSupply system = new waterSupply();
        int n = 2;
        int[] wells = {1, 1};
        int[][] pipes = {{1, 2, 1}, {1, 2, 2}};
        int result = system.minCostToSupplyWater(n, wells, pipes);
        System.out.println(result);
    }
}
