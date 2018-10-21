package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortColorsTest {
    SortColors sol = new SortColors();

    @Test
    public void test01() {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        int[] ans = new int[]{0, 0, 1, 1, 2, 2};
        sol.sortColors(nums);
        Assertions.assertTrue(Arrays.equals(ans, nums));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{1, 2, 2, 1, 1};
        int[] ans = new int[]{1, 1, 1, 2, 2};
        sol.sortColors(nums);
        Assertions.assertTrue(Arrays.equals(ans, nums));
    }

    @Test
    public void test03() {
        int[] nums = new int[]{1, 0};
        int[] ans = new int[]{0, 1};
        sol.sortColors(nums);
        Assertions.assertTrue(Arrays.equals(ans, nums));
    }
}
