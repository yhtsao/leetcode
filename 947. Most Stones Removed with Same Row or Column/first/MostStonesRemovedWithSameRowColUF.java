package first;

public class MostStonesRemovedWithSameRowColUF {
    int[] father;
    int cnt;

    private void union(int x, int y) {
        int fatherX = find(x);
        int fatherY = find(y);
        if (fatherX != fatherY) {
            cnt++;
            father[find(x)] = find(y);
        }
    }

    private int find(int x) {
        if (father[x] != x)
            return find(father[x]);
        return x;
    }

    public int removeStones(int[][] stones) {
        this.father = new int[stones.length];
        this.cnt = 0;
        for (int i = 0; i < father.length; i++)
            father[i] = i;

        for (int i = 0; i < stones.length; i++) {
            for (int j = i + 1; j < stones.length; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1])
                    union(i, j);
            }
        }
        return cnt;
    }
}
