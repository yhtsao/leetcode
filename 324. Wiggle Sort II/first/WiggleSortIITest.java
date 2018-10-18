package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WiggleSortIITest {
    private WiggleSortII sol = new WiggleSortII();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 5, 1, 1, 6, 4};
        sol.wiggleSort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0)
                Assertions.assertTrue(nums[i] < nums[i - 1]);
            else
                Assertions.assertTrue(nums[i] > nums[i - 1]);
        }
    }

    @Test
    public void test02() {
        int[] nums = new int[]{1, 3, 2, 2, 3, 1};
        sol.wiggleSort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0)
                Assertions.assertTrue(nums[i] < nums[i - 1]);
            else
                Assertions.assertTrue(nums[i] > nums[i - 1]);
        }
    }

    @Test
    public void test03() {
        int[] nums = new int[]{1, 3, 1, 1, 3};
        sol.wiggleSort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0)
                Assertions.assertTrue(nums[i] < nums[i - 1]);
            else
                Assertions.assertTrue(nums[i] > nums[i - 1]);
        }
    }
}
