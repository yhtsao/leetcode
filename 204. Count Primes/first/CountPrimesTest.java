package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountPrimesTest {
    private CountPrimes sol = new CountPrimes();

    @Test
    public void test01() {
        int n = 10;
        int ans = 4;
        int res = sol.countPrimes(n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int n = 4;
        int ans = 2;
        int res = sol.countPrimes(n);
        Assertions.assertEquals(ans, res);
    }
}
