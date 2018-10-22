package first;

public class BestTimeForStockIV {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0 || k == 0) return 0;
        if (k >= prices.length) return sellAndBuyEveryDay(prices);

        int[] dp = new int[prices.length];
        for (int i = 0; i < prices.length; i++)
            dp[i] = 0;

        int maxDiff;
        for (int i = 1; i <= k; i++) {
            maxDiff = dp[0] - prices[0];
            for (int j = 1; j < prices.length; j++) {
                //int maxProfitIfSellStock = maxProfitWithTrasactionOnJday(prices, dp, i, j);
                int newProfit = Math.max(dp[j - 1], prices[j] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[j] - prices[j]);
                dp[j] = newProfit;
            }
        }
        return dp[prices.length - 1];
    }

    private int sellAndBuyEveryDay(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++)
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        return maxProfit;
    }

    private int maxProfitWithTrasactionOnJday(int[] prices, int[][] dp, int i, int j) {
        int max = 0;
        for (int m = 0; m < j; m++) {
            max = Math.max(max, prices[j] - prices[m] + dp[i - 1][m]);
        }
        return max;
    }
}
