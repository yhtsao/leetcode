package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeForStockIVTest {
    BestTimeForStockIV sol = new BestTimeForStockIV();

    @Test
    public void test01() {
        int[] price = new int[]{2, 5, 7, 1, 4, 3, 1, 3};
        int k = 3;

        int ans = 10;
        int ret = sol.maxProfit(k, price);
        Assertions.assertEquals(ans, ret);
    }
}
