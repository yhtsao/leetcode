package first;

public class BricksFallingWhenHitUF {
    private final int[][] dirs = new int[][]{{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    private int[] father, count;

    private int find(int x) {
        if (father[x] != x) return find(father[x]);
        return x;
    }

    private void union(int x, int y) {
        int fatherX = find(x);
        int fatherY = find(y);
        if (fatherX == fatherY) return;
        if (count[fatherX] > count[fatherY]) {
            father[fatherY] = fatherX;
            count[fatherX] += count[fatherY];
        } else {
            father[fatherX] = fatherY;
            count[fatherY] += count[fatherX];
        }
    }

    public int[] hitBricks(int[][] grid, int[][] hits) {
        int[] ret = new int[hits.length];
        father = new int[grid.length * grid[0].length + 1];
        count = new int[grid.length * grid[0].length + 1];

        // initialize groups
        for (int i = 0; i <= grid.length * grid[0].length; i++) {
            father[i] = i;
            count[i] = 1;
        }

        // mark all hit bricks
        for (int[] hit : hits)
            grid[hit[0]][hit[1]]--;

        // union all no drop and connected bricks
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1) unionNeighbor(grid, i, j);
        }

        // reversely put the dropped bricks back
        // and check the difference of bricks that connected to roof (top)
        int roofConnectCnt = 0;
        for (int i = hits.length - 1; i >= 0; i--) {
            roofConnectCnt = count[find(0)];
            grid[hits[i][0]][hits[i][1]]++;
            if (grid[hits[i][0]][hits[i][1]] != 1) continue;
            unionNeighbor(grid, hits[i][0], hits[i][1]);
            ret[i] = Math.max(0, count[find(0)] - roofConnectCnt - 1);
        }

        return ret;
    }

    private void unionNeighbor(int[][] grid, int row, int col) {
        for (int[] dir : dirs) {
            int i = row + dir[0], j = col + dir[1];
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) continue;
            union(row * grid[0].length + col + 1, i * grid[0].length + j + 1);
        }
        if (row == 0) union(0, row * grid[0].length + col + 1);
    }
}
