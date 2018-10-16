package first;

public class LongestIncreasingPath {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0) return 0;

        int max = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, dfs(matrix, i, j, dp));
            }
        }
        return max;
    }

    private int dfs(int[][] matrix, int row, int col, int[][] dp) {
        if (dp[row][col] != 0) return dp[row][col];

        int max = 0;
        if (row - 1 >= 0 && matrix[row][col] < matrix[row - 1][col])
            max = Math.max(max, dfs(matrix, row - 1, col, dp));
        if (row + 1 < matrix.length && matrix[row][col] < matrix[row + 1][col])
            max = Math.max(max, dfs(matrix, row + 1, col, dp));
        if (col - 1 >= 0 && matrix[row][col] < matrix[row][col - 1])
            max = Math.max(max, dfs(matrix, row, col - 1, dp));
        if (col + 1 < matrix[0].length && matrix[row][col] < matrix[row][col + 1])
            max = Math.max(max, dfs(matrix, row, col + 1, dp));
        dp[row][col] = max + 1;
        return dp[row][col];
    }
}
