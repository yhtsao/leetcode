package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContinuousSubarraySumTest {
    ContinuousSubarraySum sol = new ContinuousSubarraySum();

    @Test
    public void test01() {
        int[] nums = new int[]{23, 2, 4, 6, 7};
        int k = 6;
        boolean ans = true;
        Assertions.assertEquals(ans, sol.checkSubarraySum(nums, k));
    }
}
