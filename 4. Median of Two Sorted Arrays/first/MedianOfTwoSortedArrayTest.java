package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

class MedianOfTwoSortedArrayTest {
    @Test
    public void test() {
        MedianOfTwoSortedArray median = new MedianOfTwoSortedArray();

        int[] nums1 = genRandomArray(100, 100);
        int[] nums2 = genRandomArray(100, 100);
        Assertions.assertEquals(median.findMedianBruteForce(nums1, nums2), median.findMedianSortedArrays(nums1, nums2));
        System.out.println(median.findMedianBruteForce(nums1, nums2));

        nums1 = new int[]{};
        nums2 = new int[]{2, 3};
        System.out.println(median.findMedianBruteForce(nums1, nums2));
    }

    private static int[] genRandomArray(int size, int maxVal) {
        Random rand = new Random();
        int nums1Len = Math.abs(rand.nextInt() % size) + 1;
        int[] nums = new int[nums1Len];
        for (int i = 0; i < nums1Len; i++) {
            nums[i] = Math.abs(rand.nextInt() % maxVal) + 1;
        }
        Arrays.sort(nums);
        return nums;
    }
}