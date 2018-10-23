package first;

public class FindMinInRotatedSortedArr {
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            if (nums[lo] < nums[hi])
                return nums[lo];
            int mid = (lo + hi) / 2;
            if (nums[mid] >= nums[lo])
                lo = mid + 1;
            else
                hi = mid;
        }
        return nums[lo];
    }

    private int binarySearch(int[] nums, int lo, int hi) {
        if (lo == hi || nums[lo] <= nums[hi]) return nums[lo];
        int mid = lo + (hi - lo) / 2;
        int leftMin = binarySearch(nums, lo, mid);
        int rightMin = binarySearch(nums, mid + 1, hi);
        return Math.min(leftMin, rightMin);
    }
}
