package first;

public class BricksFallingWhenHitTLEVer {
    // Naive version, TLE on OJ
    // Time: O(m * n * #hits)
    private final int[][] dirs = new int[][]{{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    public int[] hitBricks(int[][] grid, int[][] hits) {
        int[] ret = new int[hits.length];
        int bricksCnt = 0;
        // Count how many 1's
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++)
                if (grid[i][j] == 1) bricksCnt++;
        }

        int notDrop = 1;
        for (int i = 0; i < hits.length; i++) {
            if (grid[hits[i][0]][hits[i][1]] == 0) continue;
            grid[hits[i][0]][hits[i][1]] = 0;

            // Count numbers of bricks connected to top
            int notDropCnt = 0;
            for (int j = 0; j < grid[0].length; j++)
                notDropCnt += dfs(grid, 0, j, notDrop, notDrop + 1);

            // Mark all dropped bricks to 0
            grid[hits[i][0]][hits[i][1]] = notDrop;
            dfs(grid, hits[i][0], hits[i][1], notDrop, 0);

            ret[i] = bricksCnt - notDropCnt - 1;
            bricksCnt = notDropCnt;
            notDrop++;

        }
        return ret;
    }

    private int dfs(int[][] grid, int row, int col, int origVal, int changeVal) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != origVal)
            return 0;

        int cnt = 1;
        grid[row][col] = changeVal;
        for (int[] dir : dirs)
            cnt += dfs(grid, row + dir[0], col + dir[1], origVal, changeVal);
        return cnt;
    }
}
