package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubarraySumEqualToKTest {
    SubarraySumEqualToK sol = new SubarraySumEqualToK();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 1, 1};
        int k = 2;
        int ans = 2;
        Assertions.assertEquals(ans, sol.subarraySum(nums, k));
    }
}
