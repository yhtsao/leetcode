package first;

public class GuessNumberHiLoII {
    // dp[i][j] = k + max(dp[i][k - 1], dp[k + 1][j]), for k = i ... j
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i][i] = 0;
            dp[i - 1][i] = i - 1;
        }

        for (int len = 3; len <= n; len++) {
            for (int i = 1; i <= n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], k + Math.max(dp[i][k - 1], dp[k + 1][j]));
                }
            }
        }

        return dp[1][n];
    }
}
