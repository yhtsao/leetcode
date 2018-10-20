package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTrailingZeroesTest {
    private first.FactorialTrailingZeroes sol = new first.FactorialTrailingZeroes();

    @Test
    public void test01() {
        int n = 3;
        int ans = 0;
        int ret = sol.trailingZeroes(n);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int n = 5;
        int ans = 1;
        int ret = sol.trailingZeroes(n);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        int n = 100;
        int ans = 24;
        int ret = sol.trailingZeroes(n);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test04() {
        int n = Integer.MAX_VALUE;
        int ans = 536870902;
        int ret = sol.trailingZeroes(n);
        Assertions.assertEquals(ans, ret);
    }
}
