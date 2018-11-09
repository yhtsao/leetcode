package first;

public class BricksFallingWhenHitDFS {
    // Time: O(m * n) + O(#hits)
    private final int[][] dirs = new int[][]{{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    public int[] hitBricks(int[][] grid, int[][] hits) {
        int[] ret = new int[hits.length];

        // mark all hit bricks to 0
        for (int[] hit : hits)
            grid[hit[0]][hit[1]]--;

        // mark all no-drop bricks (connected to top) to 2
        for (int i = 0; i < grid[0].length; i++)
            dfs(grid, 0, i);

        // reversely run dfs of all hit to find connected 1's
        for (int i = hits.length - 1; i >= 0; i--) {
            grid[hits[i][0]][hits[i][1]]++;
            if (grid[hits[i][0]][hits[i][1]] == 0 || !isConnectedToTop(grid, hits[i][0], hits[i][1])) continue;
            ret[i] = dfs(grid, hits[i][0], hits[i][1]) - 1;
        }

        return ret;
    }

    private int dfs(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != 1)
            return 0;
        int cnt = 1;
        grid[row][col] = 2;
        for (int[] dir : dirs)
            cnt += dfs(grid, row + dir[0], col + dir[1]);
        return cnt;
    }

    private boolean isConnectedToTop(int[][] grid, int row, int col) {
        if (row == 0) return true;
        for (int[] dir : dirs) {
            int i = row + dir[0], j = col + dir[1];
            if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 2) return true;
        }

        return false;
    }
}
