package first;

public class BestTimeForStockCooldown {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        // ** buy[i] is the max profit up to day i with buy as last action;
        // ** sell[i] is the max profit up to day i with sell as last action.
        // buy[i] = max(sell[i - 2] - price, buy[i - 1])
        // sell[i] = max(sell[i - 1], buy[i - 1] + price);
        int prevBuy, buy = Integer.MIN_VALUE;
        int prevSell = 0, sell = 0;
        for (int price : prices) {
            prevBuy = buy;
            buy = Math.max(prevSell - price, prevBuy);
            prevSell = sell;
            sell = Math.max(prevSell, prevBuy + price);
        }
        return sell;
    }
}
