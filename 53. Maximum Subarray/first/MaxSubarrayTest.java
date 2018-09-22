package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxSubarrayTest {
    private MaxSubarray maxSubarray = new MaxSubarray();

    @Test
    public void test01() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = 6;
        int result = maxSubarray.maxSubArray(nums);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{2, 1, -5};
        int ans = 3;
        int result = maxSubarray.maxSubArray(nums);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{2, 1, -5, 8};
        int ans = 8;
        int result = maxSubarray.maxSubArray(nums);
        Assertions.assertEquals(ans, result);
    }
}
