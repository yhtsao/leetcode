package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOf1BitsTest {
    private NumberOf1Bits sol = new NumberOf1Bits();

    @Test
    public void test01() {
        int n = 7;
        int ans = 3;
        int res = sol.hammingWeight(n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int n = 128;
        int ans = 1;
        int res = sol.hammingWeight(n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        int n = 0;
        int ans = 0;
        int res = sol.hammingWeight(n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        int n = 1;
        int ans = 1;
        int res = sol.hammingWeight(n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        int n = Integer.MIN_VALUE;
        int ans = 1;
        int res = sol.hammingWeight(n);
        Assertions.assertEquals(ans, res);
    }
}
