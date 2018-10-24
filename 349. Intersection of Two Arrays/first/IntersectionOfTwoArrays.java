package first;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        return intersectionTwoPtr(nums1, nums2);
    }

    public int[] intersectionHash(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersectSet = new HashSet<>();
        for (int num1 : nums1)
            set.add(num1);
        for (int num2 : nums2) {
            if (set.contains(num2)) intersectSet.add(num2);
        }
        int[] ret = new int[intersectSet.size()];
        int i = 0;
        for (int num : intersectSet)
            ret[i++] = num;
        return ret;
    }

    public int[] intersectionTwoPtr(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Set<Integer> intersect = new HashSet<>();
        int nums1Ptr = 0, nums2Ptr = 0;
        while (nums1Ptr < nums1.length && nums2Ptr < nums2.length) {
            if (nums1[nums1Ptr] == nums2[nums2Ptr]) {
                intersect.add(nums1[nums1Ptr]);
                nums1Ptr++;
                nums2Ptr++;
            } else if (nums1[nums1Ptr] < nums2[nums2Ptr]) {
                nums1Ptr++;
            } else {
                nums2Ptr++;
            }
        }

        int[] ret = new int[intersect.size()];
        int i = 0;
        for (int num : intersect)
            ret[i++] = num;
        return ret;
    }
}
