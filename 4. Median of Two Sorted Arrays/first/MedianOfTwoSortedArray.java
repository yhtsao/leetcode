package first;

import java.util.Arrays;

public class MedianOfTwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;

        int nums1Len = nums1.length, nums2Len = nums2.length;

        if ((nums1Len + nums2Len) % 2 == 0) {
            median = (findKth(nums1, 0, nums1Len - 1,
                    nums2, 0, nums2Len - 1, (nums1Len + nums2Len) / 2)
                    + findKth(nums1, 0, nums1Len - 1,
                    nums2, 0, nums2Len - 1, (nums1Len + nums2Len) / 2 + 1)) / 2;
        } else {
            median = findKth(nums1, 0, nums1Len - 1,
                    nums2, 0, nums2Len - 1, (nums1Len + nums2Len) / 2 + 1);
        }
        return median;
    }

    public double findKth(int[] nums1, int nums1Lo, int nums1Hi, int[] nums2, int nums2Lo, int nums2Hi, int k) {
        int nums1Len = nums1Hi - nums1Lo + 1;
        int nums2Len = nums2Hi - nums2Lo + 1;
        if (nums1Len > nums2Len)
            return findKth(nums2, nums2Lo, nums2Hi, nums1, nums1Lo, nums1Hi, k);
        if (nums1Len == 0)
            return nums2[nums2Lo + k - 1];
        if (k == 1)
            return Math.min(nums1[nums1Lo], nums2[nums2Lo]);


        int nums1Ptr = Math.min(k / 2, nums1Len), nums2Ptr = k - nums1Ptr;
        if (nums1[nums1Lo + nums1Ptr - 1] > nums2[nums2Lo + nums2Ptr - 1]) {
            return findKth(nums1, nums1Lo, nums1Hi, nums2, nums2Lo + nums2Ptr, nums2Hi, k - nums2Ptr);
        } else if (nums1[nums1Lo + nums1Ptr - 1] < nums2[nums2Lo + nums2Ptr - 1]) {
            return findKth(nums1, nums1Lo + nums1Ptr, nums1Hi, nums2, nums2Lo, nums2Hi, k - nums1Ptr);
        } else {
            return nums1[nums1Lo + nums1Ptr - 1];
        }
    }

    public double findMedianBruteForce(int[] nums1, int[] nums2) {
        int aLen = nums1.length;
        int bLen = nums2.length;
        int[] c = new int[aLen + bLen];
        System.arraycopy(nums1, 0, c, 0, aLen);
        System.arraycopy(nums2, 0, c, aLen, bLen);

        Arrays.sort(c);

        double median;
        if (c.length % 2 == 0) {
            median = (double) (c[c.length / 2] + c[c.length / 2 - 1]) / 2;
        } else {
            median = c[c.length / 2];
        }
        return median;

    }
}
