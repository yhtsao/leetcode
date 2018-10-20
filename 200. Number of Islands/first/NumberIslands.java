package first;

public class NumberIslands {
    public int numIslands(char[][] grid) {
        return numIslandsUF(grid);
    }

    // ------------------------------------------------
    // DFS solution
    // ------------------------------------------------
    private int numIslandsDFS(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int row, int col) {
        grid[row][col] = '0';
        if (row - 1 >= 0 && grid[row - 1][col] == '1')
            dfs(grid, row - 1, col);
        if (row + 1 < grid.length && grid[row + 1][col] == '1')
            dfs(grid, row + 1, col);
        if (col - 1 >= 0 && grid[row][col - 1] == '1')
            dfs(grid, row, col - 1);
        if (col + 1 < grid[0].length && grid[row][col + 1] == '1')
            dfs(grid, row, col + 1);
    }

    // ------------------------------------------------
    // Union-Find solution
    // ------------------------------------------------
    private int[] parent;
    private int numOfGroup;

    private int find(int x) {
        if (parent[x] != x)
            return find(parent[x]);
        return x;
    }

    private void union(int x, int y) {
        int findx = find(x);
        int findy = find(y);
        if (findx != findy) {
            parent[find(x)] = find(y);
            numOfGroup--;
        }
    }

    private int numIslandsUF(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        parent = new int[grid.length * grid[0].length];
        numOfGroup = 0;

        // Initial all groups
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    parent[i * grid[0].length + j] = i * grid[0].length + j;
                    numOfGroup++;
                }
            }
        }

        // for each island cell, if its right and below cell is island
        // union right/below cell to current cell
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '0') continue;
                if (i < grid.length - 1 && grid[i + 1][j] == '1')
                    union(i * grid[0].length + j, (i + 1) * grid[0].length + j);
                if (j < grid[0].length - 1 && grid[i][j + 1] == '1')
                    union(i * grid[0].length + j, i * grid[0].length + j + 1);
            }
        }

        return numOfGroup;
    }

}
