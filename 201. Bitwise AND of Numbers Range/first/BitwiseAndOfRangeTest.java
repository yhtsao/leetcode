package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BitwiseAndOfRangeTest {
    private BitwiseAndOfRange sol = new BitwiseAndOfRange();

    @Test
    public void test01() {
        int m = 0, n = 1;
        int ans = 0;
        int res = sol.rangeBitwiseAnd(m, n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int m = 5, n = 7;
        int ans = 4;
        int res = sol.rangeBitwiseAnd(m, n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        int m = 26, n = 31;
        int ans = 24;
        int res = sol.rangeBitwiseAnd(m, n);
        Assertions.assertEquals(ans, res);
    }
}
