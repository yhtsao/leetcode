package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubarrayProductLessThanKTest {
    SubarrayProductLessThanK sol = new SubarrayProductLessThanK();

    @Test
    public void test01() {
        int[] nums = new int[]{10, 5, 2, 6};
        int k = 100;
        int ans = 8;
        Assertions.assertEquals(ans, sol.numSubarrayProductLessThanK(nums, k));
    }
}
