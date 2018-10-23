package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMinInRotatedSortedArrTest {
    FindMinInRotatedSortedArr sol = new FindMinInRotatedSortedArr();

    @Test
    public void test01() {
        int[] nums = new int[]{6, 7, 0, 1, 2, 3, 4, 5};
        int ans = 0;
        Assertions.assertEquals(ans, sol.findMin(nums));
        nums = new int[]{4, 5, 6, 7, 0, 1, 2, 3};
        Assertions.assertEquals(ans, sol.findMin(nums));
        nums = new int[]{2, 3, 4, 5, 6, 7, 0, 1};
        Assertions.assertEquals(ans, sol.findMin(nums));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        int ans = 1;
        Assertions.assertEquals(ans, sol.findMin(nums));
    }

    @Test
    public void test03() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int ans = 0;
        Assertions.assertEquals(ans, sol.findMin(nums));
    }
}
