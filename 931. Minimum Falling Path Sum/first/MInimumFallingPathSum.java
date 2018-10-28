package first;

import java.util.Arrays;

public class MInimumFallingPathSum {
    public int minFallingPathSum(int[][] A) {
        if (A.length == 0 || A[0].length == 0) return 0;
        int minSum = Integer.MAX_VALUE;
        int[][] memo = new int[A.length][A[0].length];
        for (int[] row : memo) Arrays.fill(row, Integer.MAX_VALUE);
        for (int i = 0; i < A[0].length; i++)
            minSum = Math.min(minSum, dfs(A, 0, i, memo));

        return minSum;
    }

    private int dfs(int[][] A, int row, int col, int[][] memo) {
        if (row == A.length || col == A[0].length || col < 0) return Integer.MAX_VALUE;
        if (memo[row][col] != Integer.MAX_VALUE) return memo[row][col];
        if (row == A.length - 1) return A[row][col];

        memo[row][col] = A[row][col] + Math.min(dfs(A, row + 1, col - 1, memo),
                Math.min(dfs(A, row + 1, col, memo), dfs(A, row + 1, col + 1, memo)));
        return memo[row][col];
    }
}
