import java.util.Arrays;
import java.util.List;

class Solution {
    public int findTheCity(int n, List<List<Integer>> edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            dist[i][i] = 0;
        }
        for (List<Integer> edge : edges) {
            int i = edge.get(0);
            int j = edge.get(1);
            int w = edge.get(2);
            dist[i][j] = w;
            dist[j][i] = w;
        }
        int[] minDistance = new int[n];
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int newDist = dist[i][k] + dist[k][j];
                    if (dist[i][j] > newDist) {
                        dist[i][j] = newDist;
                    }
                }
            }
        }

        int res = 0, minCount = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minDistance[i] = 0;
            for (int j = 0; j < n; j++) {
                if (dist[i][j] <= distanceThreshold) {
                    minDistance[i]++;
                }
            }
            if (minCount >= minDistance[i]) {
                res = i;
                minCount = minDistance[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n1 = 4;
        List<List<Integer>> edges1 = Arrays.asList(Arrays.asList(0, 1, 3), Arrays.asList(1, 2, 1), Arrays.asList(1, 3, 4), Arrays.asList(2, 3, 1));
        int distanceThreshold1 = 4;
        Solution solution = new Solution();
        int result = solution.findTheCity(n1, edges1, distanceThreshold1);
        System.out.println(result);
    }
}
