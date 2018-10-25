package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberIITest {
    HouseRobberII sol = new HouseRobberII();

    @Test
    public void test01() {
        int[] nums = new int[]{2, 3, 2};
        int ans = 3;
        Assertions.assertEquals(ans, sol.rob(nums));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{1, 2, 3, 1};
        int ans = 4;
        Assertions.assertEquals(ans, sol.rob(nums));
    }

    @Test
    public void test03() {
        int[] nums = new int[]{1};
        int ans = 1;
        Assertions.assertEquals(ans, sol.rob(nums));
    }
}
