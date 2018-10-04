package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeForStockTest {
    private BestTimeForStock sol = new BestTimeForStock();

    @Test
    public void test01() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int ans = 5;
        int res = sol.maxProfit(prices);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int ans = 0;
        int res = sol.maxProfit(prices);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        int[] prices = new int[]{2, 8, 4, 1, 9};
        int ans = 8;
        int res = sol.maxProfit(prices);
        Assertions.assertEquals(ans, res);
    }
}
