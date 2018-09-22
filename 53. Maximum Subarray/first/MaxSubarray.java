package first;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {

        return maxSubArrayDP(nums);
    }

    private int maxSubArrayIterative(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0)
                sum = nums[i];
            else
                sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    private int maxSubArrayDP(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length]; // dp[i] is the max sum of subarray contains nums[i]
        dp[0] = nums[0];
        int maxSum = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }

    private int maxSubArrayDivide(int[] nums) {
        return maxSubArraySum(nums, 0, nums.length - 1);
    }

    private int maxSubArraySum(int[] nums, int lo, int hi) {
        if (lo >= hi)
            return nums[lo];

        int mid = lo + (hi - lo) / 2;
        int maxSum = Math.max(maxSubArraySum(nums, lo, mid),
                maxSubArraySum(nums, mid + 1, hi));
        maxSum = Math.max(maxSum, maxCrossArraySum(nums, lo, hi, mid));
        return maxSum;
    }

    private int maxCrossArraySum(int[] nums, int lo, int hi, int mid) {
        int leftMax = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= lo; i--) {
            sum += nums[i];
            leftMax = Math.max(leftMax, sum);
        }

        int rightMax = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= hi; i++) {
            sum += nums[i];
            rightMax = Math.max(rightMax, sum);
        }

        return leftMax + rightMax;
    }
}
