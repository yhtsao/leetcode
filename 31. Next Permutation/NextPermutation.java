public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int p = nums.length - 1;
        while (p > 0 && nums[p] <= nums[p - 1]) {
            p--;
        }
        if (p == 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        if (p == nums.length - 1) {
            swap(nums, p - 1, p);
            return;
        }
        int tempP = p;
        while (tempP < nums.length && nums[p - 1] < nums[tempP]) {
            tempP++;
        }
        swap(nums, p - 1, tempP - 1);

        tempP = p;
        while (tempP < nums.length - 1 && nums[tempP] < nums[tempP + 1]) {
            swap(nums, tempP, tempP + 1);
            tempP++;
        }
        reverse(nums, p, nums.length - 1);
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(int[] nums, int lo, int hi) {
        while (lo < hi) {
            swap(nums, lo, hi);
            lo++;
            hi--;
        }
    }
}
