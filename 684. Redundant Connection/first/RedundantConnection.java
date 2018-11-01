package first;

public class RedundantConnection {
    // union find
    int[] father;
    int[] rank; // path compression

    private int find(int x) {
        if (father[x] != x)
            return find(father[x]);
        return x;
    }

    private void union(int x, int y) {
        int rootX = find(x), rootY = find(y);
        if (rank[rootX] < rank[rootY]) {
            father[rootX] = rootY;
            rank[rootY] += rank[rootX];
        } else {
            father[rootY] = rootX;
            rank[rootX] += rank[rootY];
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        this.father = new int[edges.length + 1];
        this.rank = new int[edges.length + 1];
        for (int i = 0; i < father.length; i++)
            father[i] = i;

        int[] redundantEdge = null;
        for (int[] edge : edges) {
            if (find(edge[0]) == find(edge[1]))
                redundantEdge = edge;
            else {
                union(edge[0], edge[1]);
            }
        }
        return redundantEdge;
    }
}
