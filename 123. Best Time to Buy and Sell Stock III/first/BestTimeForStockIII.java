package first;

import java.util.Arrays;

public class BestTimeForStockIII {
    public int maxProfit(int[] prices) {
        return maxProfitV2(prices);
    }

    private int maxProfitV1(int[] prices) {
        if (prices.length == 0) return 0;
        int[][] dp = new int[3][prices.length];
        for (int i = 0; i < prices.length; i++)
            dp[0][i] = 0;
        for (int i = 0; i <= 2; i++)
            dp[i][0] = 0;

        int maxDiff;
        for (int i = 1; i <= 2; i++) {
            maxDiff = dp[1][0] - prices[0];
            for (int j = 1; j < prices.length; j++) {
                //int maxProfitIfSellStock = maxProfitWithTrasactionOnJday(prices, dp, i, j);
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[i - 1][j] - prices[j]);
            }
        }
        return dp[2][prices.length - 1];
    }

    private int maxProfitV2(int[] prices) {
        if (prices.length == 0) return 0;
        int oneBuy = Integer.MIN_VALUE;
        int oneBuyOneSell = 0;
        int twoBuy = Integer.MIN_VALUE;
        int twoBuyTwoSell = 0;

        for (int price : prices) {
            twoBuyTwoSell = Math.max(twoBuyTwoSell, twoBuy + price);
            twoBuy = Math.max(twoBuy, oneBuyOneSell - price);
            oneBuyOneSell = Math.max(oneBuyOneSell, oneBuy + price);
            oneBuy = Math.max(oneBuy, -price);
        }
        return twoBuyTwoSell;
    }

    private int maxProfitWithTrasactionOnJday(int[] prices, int[][] dp, int i, int j) {
        int max = 0;
        for (int m = 0; m < j; m++) {
            max = Math.max(max, prices[j] - prices[m] + dp[i - 1][m]);
        }
        return max;
    }
}
