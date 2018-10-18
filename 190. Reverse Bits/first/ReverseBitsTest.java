package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseBitsTest {
    private ReverseBits sol = new ReverseBits();

    @Test
    public void test01() {
        int n = 43261596;
        int ans = 964176192;
        int res = sol.reverseBits(n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int n = Integer.MAX_VALUE;
        int ans = -2;
        int res = sol.reverseBits(n);
        Assertions.assertEquals(ans, res);
    }
}
