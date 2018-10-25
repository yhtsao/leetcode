package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class New21GameTest {
    New21Game sol = new New21Game();

    @Test
    public void test01() {
        int n = 10;
        int k = 1;
        int w = 10;
        double ans = 1;
        double ret = sol.new21Game(n, k, w);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int n = 6;
        int k = 1;
        int w = 10;
        double ans = 0.6;
        double ret = sol.new21Game(n, k, w);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        int n = 21;
        int k = 17;
        int w = 10;
        double ans = 0.73278;
        double ret = sol.new21Game(n, k, w);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test04() {
        int n = 6;
        int k = 5;
        int w = 3;
        double ans = 0.84774;
        double ret = sol.new21Game(n, k, w);
        Assertions.assertEquals(ans, ret);
    }
}
