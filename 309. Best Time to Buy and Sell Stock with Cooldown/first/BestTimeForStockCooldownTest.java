package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeForStockCooldownTest {
    BestTimeForStockCooldown sol = new BestTimeForStockCooldown();

    @Test
    public void test01() {
        int[] prices = new int[]{1, 2, 3, 0, 2};
        int ans = 3;
        int ret = sol.maxProfit(prices);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int[] prices = new int[]{1, 2, 5, 1, 4, 6};
        int ans = 6;
        int ret = sol.maxProfit(prices);
        Assertions.assertEquals(ans, ret);
    }

}
