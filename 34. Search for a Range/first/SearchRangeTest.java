package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SearchRangeTest {
    @Test
    public void test() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = new int[]{3, 4};
        SearchRange searchRange = new SearchRange();
        int[] result = searchRange.searchRange(nums, target);
        Assertions.assertTrue(Arrays.equals(ans, result));

        target = 5;
        ans = new int[]{0, 0};
        result = searchRange.searchRange(nums, target);
        Assertions.assertTrue(Arrays.equals(ans, result));

        target = 7;
        ans = new int[]{1, 2};
        result = searchRange.searchRange(nums, target);
        Assertions.assertTrue(Arrays.equals(ans, result));

        target = 10;
        ans = new int[]{5, 5};
        result = searchRange.searchRange(nums, target);
        Assertions.assertTrue(Arrays.equals(ans, result));

        target = 6;
        ans = new int[]{-1, -1};
        result = searchRange.searchRange(nums, target);
        Assertions.assertTrue(Arrays.equals(ans, result));
    }

    @Test
    public void test01() {
        int[] nums = new int[]{};
        int target = 8;
        int[] ans = new int[]{-1, -1};
        SearchRange searchRange = new SearchRange();
        int[] result = searchRange.searchRange(nums, target);
        Assertions.assertTrue(Arrays.equals(ans, result));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{0, 0};
        int target = 0;
        int[] ans = new int[]{0, 1};
        SearchRange searchRange = new SearchRange();
        int[] result = searchRange.searchRange(nums, target);
        Assertions.assertTrue(Arrays.equals(ans, result));
    }

    @Test
    public void test03() {
        int[] nums = new int[]{0};
        int target = 0;
        int[] ans = new int[]{0, 0};
        SearchRange searchRange = new SearchRange();
        int[] result = searchRange.searchRange(nums, target);
        Assertions.assertTrue(Arrays.equals(ans, result));
    }
}