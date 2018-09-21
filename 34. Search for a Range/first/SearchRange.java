package first;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {

        int index = binarySearchFirstOccurrence(nums, target);
        if (nums.length == 0 || nums[index] != target)
            return new int[]{-1, -1};

        int indexOfNextInt = binarySearchFirstOccurrence(nums, target + 1);
        if (nums[indexOfNextInt] != target) indexOfNextInt--;
        return new int[]{index, indexOfNextInt};
    }

    private int binarySearchFirstOccurrence(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = (hi - lo) / 2 + lo;
            if (nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }
}
