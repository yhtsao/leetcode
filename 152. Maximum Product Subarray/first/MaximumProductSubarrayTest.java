package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumProductSubarrayTest {
    private MaximumProductSubarray sol = new MaximumProductSubarray();

    @Test
    public void test01() {
        int[] nums = new int[]{2, 3, -2, 4};
        int ans = 6;
        int res = sol.maxProduct(nums);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{-2, 0, -1};
        int ans = 0;
        int res = sol.maxProduct(nums);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{10, 0, -5, 2, -6, -3};
        int ans = 60; // {-5, 2, -6}
        int res = sol.maxProduct(nums);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        int[] nums = new int[]{-5, -3, -1, 6};
        int ans = 18;
        int res = sol.maxProduct(nums);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        int[] nums = new int[]{-1};
        int ans = -1;
        int res = sol.maxProduct(nums);
        Assertions.assertEquals(ans, res);
    }
}
