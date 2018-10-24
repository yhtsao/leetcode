package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {
    HouseRobber sol = new HouseRobber();

    @Test
    public void test01() {
        int[] nums = new int[]{6, 2, 2, 7, 1};
        int ans = 13;
        Assertions.assertEquals(ans, sol.rob(nums));
    }
}
