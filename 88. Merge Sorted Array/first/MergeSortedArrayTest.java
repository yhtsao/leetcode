package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortedArrayTest {
    private MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    public void test01() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        int[] ans = new int[]{1, 2, 2, 3, 5, 6};

        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertTrue(Arrays.equals(ans, nums1));
    }

    @Test
    public void test02() {
        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{};
        int m = 3;
        int n = 0;
        int[] ans = new int[]{1, 2, 3};

        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertTrue(Arrays.equals(ans, nums1));
    }

    @Test
    public void test03() {
        int[] nums1 = new int[]{0, 0};
        int[] nums2 = new int[]{2, 4};
        int m = 0;
        int n = 2;
        int[] ans = new int[]{2, 4};

        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertTrue(Arrays.equals(ans, nums1));
    }

    @Test
    public void test04() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{2};
        int m = 0;
        int n = 1;
        int[] ans = new int[]{2};

        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertTrue(Arrays.equals(ans, nums1));
    }

    @Test
    public void test05() {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{};
        int m = 0;
        int n = 0;
        int[] ans = new int[]{};

        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertTrue(Arrays.equals(ans, nums1));
    }

    @Test
    public void test06() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int m = 1;
        int n = 0;
        int[] ans = new int[]{1};

        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertTrue(Arrays.equals(ans, nums1));
    }
}
