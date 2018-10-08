package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoinChangeTest {
    private CoinChange coinChange = new CoinChange();

    @Test
    public void test01() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        int ans = 3;
        int res = coinChange.coinChange(coins, amount);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int[] coins = new int[]{2};
        int amount = 3;
        int ans = -1;
        int res = coinChange.coinChange(coins, amount);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        int[] coins = new int[]{5};
        int amount = 2;
        int ans = -1;
        int res = coinChange.coinChange(coins, amount);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        int[] coins = new int[]{7, 22, 30, 56};
        int amount = 100;
        int ans = 3;
        int res = coinChange.coinChange(coins, amount);
        Assertions.assertEquals(ans, res);
    }


}
