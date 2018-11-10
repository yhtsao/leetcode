package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfDistanceInTree {
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        if (edges.length == 0) return new int[]{0};

        Map<Integer, List<Integer>> graph = new HashMap<>();
        // build the graph
        for (int[] edge : edges) {
            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.putIfAbsent(edge[1], new ArrayList<>());
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        int[] nodeCnt = new int[N]; // number of nodes of this subtree
        int[] distanceSum = new int[N];

        // Run postorder DFS to get the distance sum of each subtree
        postorderDFS(graph, 0, nodeCnt, distanceSum, new boolean[N]);

        // Run preorder DFS to get sum to other nodes which is not existed in current subtree
        preorderDFS(graph, N, 0, nodeCnt, distanceSum, new boolean[N]);

        return distanceSum;
    }

    private void postorderDFS(Map<Integer, List<Integer>> graph, int curr, int[] nodeCnt, int[] distanceSum, boolean[] visited) {
        visited[curr] = true;
        List<Integer> children = graph.get(curr);
        for (Integer child : children) {
            if (!visited[child]) {
                postorderDFS(graph, child, nodeCnt, distanceSum, visited);
                nodeCnt[curr] += nodeCnt[child];
                distanceSum[curr] += distanceSum[child] + nodeCnt[child];
            }
        }
        nodeCnt[curr]++;
    }

    private void preorderDFS(Map<Integer, List<Integer>> graph, int N, int parent,
                             int[] nodeCnt, int[] distanceSum, boolean[] visited) {
        visited[parent] = true;
        List<Integer> children = graph.get(parent);
        for (Integer child : children) {
            if (!visited[child]) {
                // (N - nodeCnt[child]) nodes needs one more step to current node
                // (nodeCnt[child]) nodes needs one fewer step to current node
                distanceSum[child] = distanceSum[parent] + (N - nodeCnt[child]) - nodeCnt[child];
                preorderDFS(graph, N, child, nodeCnt, distanceSum, visited);
            }
        }
    }
}
