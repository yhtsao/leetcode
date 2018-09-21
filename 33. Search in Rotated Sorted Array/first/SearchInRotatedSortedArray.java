package first;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (hi - lo) / 2 + lo;
            if (nums[mid] == target)
                return mid;

            if (nums[lo] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[lo])
                    return binarySearch(nums, lo, mid - 1, target);
                else {
                    lo = mid + 1;
                    continue;
                }
            }
            if (nums[mid] <= nums[hi]) {
                if (target > nums[mid] && target <= nums[hi])
                    return binarySearch(nums, mid + 1, hi, target);
                else {
                    hi = mid - 1;
                    continue;
                }
            }
        }
        return -1;
    }

    private int binarySearch(int[] nums, int lo, int hi, int target) {
        if (lo > hi)
            return -1;

        int mid = (hi - lo) / 2 + lo;
        if (nums[mid] == target)
            return mid;
        if (nums[lo] == target)
            return lo;
        if (nums[hi] == target)
            return hi;


        if (nums[mid] < target)
            return binarySearch(nums, mid + 1, hi, target);
        else
            return binarySearch(nums, lo, mid - 1, target);
    }
}
