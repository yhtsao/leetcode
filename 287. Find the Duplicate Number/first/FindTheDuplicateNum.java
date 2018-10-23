package first;

public class FindTheDuplicateNum {
    public int findDuplicate(int[] nums) {
        return findDuplicateBinarySearch(nums);
    }

    // concept from linked list cycle II
    // use two pointer to find cycle start
    private int findDuplicateTwoPtr(int[] nums) {
        int slow = nums[0], fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    private int findDuplicateBinarySearch(int[] nums) {
        int min = 0, max = nums.length, mid;
        while (min < max) {
            mid = min + (max - min) / 2;
            int count = 0;
            for (int num : nums)
                if (num <= mid) count++;
            if (count > mid)
                max = mid;
            else min = mid + 1;
        }
        return min;
    }
}
