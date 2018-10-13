package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountRangeSumTest {
    private CountRangeSum sol = new CountRangeSum();

    @Test
    public void test01() {
        int[] nums = new int[]{-2, 5, -1};
        int lower = -2, upper = 2;
        int ans = 3;
        int res = sol.countRangeSum(nums, lower, upper);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{-2, 7, -1};
        int lower = -2, upper = 2;
        int ans = 2;
        int res = sol.countRangeSum(nums, lower, upper);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{-2, 5, -1, 6, -3};
        int lower = -3, upper = 2;
        int ans = 5;
        int res = sol.countRangeSum(nums, lower, upper);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        int[] nums = new int[]{9, -2, 1, -2, -3, -1, 2};
        int lower = -2, upper = 2;
        int ans = 10;
        int res = sol.countRangeSum(nums, lower, upper);
        Assertions.assertEquals(ans, res);
    }
}
