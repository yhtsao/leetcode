package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BurstBalloonsTest {
    BurstBalloons sol = new BurstBalloons();

    @Test
    public void test01() {
        int[] nums = new int[]{3, 1, 5, 8};
        int ans = 167;
        int ret = sol.maxCoins(nums);
        Assertions.assertEquals(ans, ret);
    }
}
