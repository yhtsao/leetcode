package first;


import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i)
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    private int coinChangeBacktracking(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        return backtracking(coins, amount, dp);
    }

    private int backtracking(int[] coins, int amount, int[] dp) {
        if (amount < 0) return -1;
        if (dp[amount] != 0) return dp[amount];

        int min = Integer.MAX_VALUE;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (amount - coins[i] == 0) {
                dp[amount] = 1;
                return dp[amount];
            }
            int numCoins = backtracking(coins, amount - coins[i], dp);
            if (numCoins > 0) min = Math.min(min, numCoins);
        }
        dp[amount] = min == Integer.MAX_VALUE ? -1 : min + 1;
        return dp[amount];
    }
}
