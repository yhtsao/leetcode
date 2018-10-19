package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RotateArrayTest {
    private RotateArray sol = new RotateArray();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 10;
        sol.rotate(nums, k);
        int[] ans = new int[]{5, 6, 7, 1, 2, 3, 4};
        Assertions.assertTrue(Arrays.equals(ans, nums));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 2;
        sol.rotate(nums, k);
        int[] ans = new int[]{3, 99, -1, -100};
        Assertions.assertTrue(Arrays.equals(ans, nums));
    }

    @Test
    public void test03() {
        int[] nums = new int[]{1, 2};
        int k = 1;
        sol.rotate(nums, k);
        int[] ans = new int[]{2, 1};
        Assertions.assertTrue(Arrays.equals(ans, nums));
    }
}
