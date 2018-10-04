package first;

public class BestTimeForStockII {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currProfit = Math.max(0, prices[i] - prices[i - 1]);
            maxProfit += currProfit;
        }
        return maxProfit;
    }
}
