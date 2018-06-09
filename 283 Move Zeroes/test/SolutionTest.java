import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {
    @Test
    public void test1() {
        Solution sol = new Solution();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] ans = new int[]{1, 3, 12, 0, 0};
        sol.moveZeroes(nums);
        Assertions.assertTrue(Arrays.equals(nums, ans));
    }

    @Test
    public void test2() {
        Solution sol = new Solution();
        int[] nums = new int[]{0, 0, 1};
        int[] ans = new int[]{1, 0, 0};
        sol.moveZeroes(nums);
        Assertions.assertTrue(Arrays.equals(nums, ans));
    }

    @Test
    public void test3() {
        Solution sol = new Solution();
        int[] nums = new int[]{0, 0, 1, 3, 4, 0, 0};
        int[] ans = new int[]{1, 3, 4, 0, 0, 0, 0};
        sol.moveZeroes(nums);
        Assertions.assertTrue(Arrays.equals(nums, ans));
    }

    @Test
    public void test4() {
        Solution sol = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int[] ans = new int[]{1, 2, 3, 4, 5};
        sol.moveZeroes(nums);
        Assertions.assertTrue(Arrays.equals(nums, ans));
    }
}