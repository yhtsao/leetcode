package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IntersectionOfTwoArraysIITest {
    IntersectionOfTwoArraysII sol = new IntersectionOfTwoArraysII();

    @Test
    public void test01() {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] ans = new int[]{2, 2};
        int[] ret = sol.intersect(nums1, nums2);
        Assertions.assertTrue(Arrays.equals(ans, ret));
    }

    @Test
    public void test02() {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        int[] ans = new int[]{4, 9};
        int[] ret = sol.intersect(nums1, nums2);
        Arrays.sort(ret);
        Assertions.assertTrue(Arrays.equals(ans, ret));
    }
}
