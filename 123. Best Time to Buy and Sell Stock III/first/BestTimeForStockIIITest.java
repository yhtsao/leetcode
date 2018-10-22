package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeForStockIIITest {
    BestTimeForStockIII sol = new BestTimeForStockIII();

    @Test
    public void test01() {
        int[] price = new int[]{2, 5, 7, 1, 4, 3, 1, 3};
        int ans = 8;
        int ret = sol.maxProfit(price);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int[] price = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        int ans = 6;
        int ret = sol.maxProfit(price);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        int[] price = new int[]{1, 2, 3, 4, 5};
        int ans = 4;
        int ret = sol.maxProfit(price);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test04() {
        int[] price = new int[]{7, 6, 4, 3, 1};
        int ans = 0;
        int ret = sol.maxProfit(price);
        Assertions.assertEquals(ans, ret);
    }
}
