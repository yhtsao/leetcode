package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WiggleSortTest {
    private WiggleSort sol = new WiggleSort();

    @Test
    public void test01() {
        int[] nums = new int[]{3, 5, 2, 1, 6, 4};
        sol.wiggleSort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0)
                Assertions.assertTrue(nums[i] <= nums[i - 1]);
            else
                Assertions.assertTrue(nums[i] >= nums[i - 1]);
        }
    }

    @Test
    public void test02() {
        int[] nums = new int[]{5, 1};
        sol.wiggleSort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0)
                Assertions.assertTrue(nums[i] <= nums[i - 1]);
            else
                Assertions.assertTrue(nums[i] >= nums[i - 1]);
        }
    }

    @Test
    public void test03() {
        int[] nums = new int[]{5, 1, 4, 2, 6, 3};
        sol.wiggleSort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0)
                Assertions.assertTrue(nums[i] <= nums[i - 1]);
            else
                Assertions.assertTrue(nums[i] >= nums[i - 1]);
        }
    }

    @Test
    public void test04() {
        int[] nums = new int[]{3, 1, 2, 6, 4, 5};
        sol.wiggleSort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0)
                Assertions.assertTrue(nums[i] <= nums[i - 1]);
            else
                Assertions.assertTrue(nums[i] >= nums[i - 1]);
        }
    }
}
