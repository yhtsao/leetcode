package first;


public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int max = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = currMax;
                currMax = currMin;
                currMin = tmp;
            }
            currMax = Math.max(nums[i], nums[i] * currMax);
            currMin = Math.min(nums[i], nums[i] * currMin);
            max = Math.max(max, currMax);
        }

        return max;
    }
}
