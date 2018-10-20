package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerfectSquareTest {
    private PerfectSquare sol = new PerfectSquare();

    @Test
    public void test01() {
        int n = 12;
        int ans = 3;
        int ret = sol.numSquares(n);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int n = 13;
        int ans = 2;
        int ret = sol.numSquares(n);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        int n = 9;
        int ans = 1;
        int ret = sol.numSquares(n);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test04() {
        int n = 25; // 999 * 999
        int ans = 1;
        int ret = sol.numSquares(n);
        Assertions.assertEquals(ans, ret);
    }
}
