package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SlidingWindowMaxTest {
    private SlidingWindowMax sol = new SlidingWindowMax();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = new int[]{3, 3, 5, 5, 6, 7};
        int[] res = sol.maxSlidingWindow(nums, k);
        Assertions.assertTrue(Arrays.equals(ans, res));
    }

    @Test
    public void test02() {
        int[] nums = new int[0];
        int k = 0;
        int[] ans = new int[0];
        int[] res = sol.maxSlidingWindow(nums, k);
        Assertions.assertTrue(Arrays.equals(ans, res));
    }
}
