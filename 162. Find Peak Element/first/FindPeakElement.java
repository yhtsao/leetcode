package first;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int mid = 0;

        while (lo < hi) {
            mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[mid + 1])
                hi = mid;
            else
                lo = mid + 1;
        }
        return lo;
    }

    private int findPeakElementSeq(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                return i - 1;
        }
        return nums.length - 1;
    }
}
