package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SearchInRotatedSortedArrayTest {
    @Test
    public void test01() {
        int[] nums = new int[]{0, 1, 2, 4, 5, 6, 7};
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums));
            int target = 0;
            int index = searchInRotatedSortedArray.search(nums, target);
            Assertions.assertEquals(i, index);
            rotate(nums);
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums));
            int target = 3;
            int index = searchInRotatedSortedArray.search(nums, target);
            Assertions.assertEquals(-1, index);
            rotate(nums);
        }
    }

    private void rotate(int[] nums) {
        int last = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--)
            nums[i] = nums[i - 1];
        nums[0] = last;
    }
}
