package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeForStockIITest {
    private BestTimeForStockII sol = new BestTimeForStockII();

    @Test
    public void test01() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int ans = 7;
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
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int ans = 4;
        int res = sol.maxProfit(prices);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        int[] prices = new int[]{7, 1, 4, 2, 9, 5};
        int ans = 10;
        int res = sol.maxProfit(prices);
        Assertions.assertEquals(ans, res);
    }
}
