package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {
    @Test
    public void test1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ans = new int[]{0, 1};

        TwoSum twoSum = new TwoSum();
        Assertions.assertTrue(Arrays.equals(ans, twoSum.twoSum(nums, target)));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0, 1, 4, 5, -1};
        int target = 9;
        int[] ans = new int[]{2, 3};

        TwoSum twoSum = new TwoSum();
        Assertions.assertTrue(Arrays.equals(ans, twoSum.twoSum(nums, target)));
    }
}