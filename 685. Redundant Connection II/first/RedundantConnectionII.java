package first;

public class RedundantConnectionII {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int[] parents = new int[edges.length + 1];
        // find the node with two parent,
        // and assign to candidate1 and candidate2
        int[] cand1 = null, cand2 = null; // candidate 1 & 2
        for (int[] edge : edges) {
            if (parents[edge[1]] == 0)
                parents[edge[1]] = edge[0];
            else {
                cand1 = new int[]{parents[edge[1]], edge[1]};
                cand2 = new int[]{edge[0], edge[1]};
                edge[1] = 0;
                break;
            }
        }

        for (int i = 0; i < parents.length; i++)
            parents[i] = i;

        // union-find to find cycle in graph
        for (int[] edge : edges) {
            if (edge[1] == 0) continue;
            int rootX = getRoot(parents, edge[0]), rootY = getRoot(parents, edge[1]);
            if (rootX == rootY) { // cycle detected
                if (cand1 == null) return edge;
                else return cand1;
            }
            parents[rootX] = rootY; // union
        }
        return cand2;

    }

    private int getRoot(int[] parents, int x) {
        return x == parents[x] ? x : getRoot(parents, parents[x]);
    }
}
