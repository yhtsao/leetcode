package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {
    private ClimbingStairs sol = new ClimbingStairs();

    @Test
    public void test01() {
        int n = 2;
        int ans = 2;
        int res = sol.climbStairs(n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int n = 3;
        int ans = 3;
        int res = sol.climbStairs(n);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        int n = 4;
        int ans = 5;
        int res = sol.climbStairs(n);
        Assertions.assertEquals(ans, res);
    }
}
