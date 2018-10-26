package first;

public class BurstBalloons {
    public int maxCoins(int[] nums) {
        return maxCoinDCWithMemo(nums);
    }

    /*
        dp[i][j] max coin can get after burst i to j balloons
        dp[i][j] = max(dp[i][k - 1] + dp[k + 1][j] + nums[i - 1] * nums[k] * nums[j + 1])
        for k = i ... j

        Target: find dp[0][nums.length - 1]
     */
    public int maxCoinsDP(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        int left = 0, right = 0, leftBurst = 0, rightBurst = 0;
        for (int len = 1; len <= nums.length; len++) {
            for (int i = 0; i <= nums.length - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= i + len - 1; k++) {
                    leftBurst = 0;
                    rightBurst = 0;
                    if (i != k)
                        leftBurst = dp[i][k - 1];
                    if (j != k)
                        rightBurst = dp[k + 1][j];

                    left = 1;
                    right = 1;
                    if (i > 0)
                        left = nums[i - 1];
                    if (j < nums.length - 1)
                        right = nums[j + 1];

                    dp[i][j] = Math.max(dp[i][j], leftBurst + rightBurst + left * nums[k] * right);
                }
            }
        }

        return dp[0][nums.length - 1];
    }

    public int maxCoinDCWithMemo(int[] nums) {
        if (nums.length == 0) return 0;
        int[] numsWithoutZero = new int[nums.length + 2];
        int n = 1;
        for (int num : nums)
            if (num > 0) numsWithoutZero[n++] = num;
        numsWithoutZero[0] = numsWithoutZero[n++] = 1;

        int[][] memo = new int[n][n];
        return burst(numsWithoutZero, 0, n - 1, memo);
    }

    private int burst(int[] nums, int left, int right, int[][] memo) {
        if (left + 1 == right) return 0;
        if (memo[left][right] > 0) return memo[left][right];

        int maxBurst = 0;
        for (int i = left + 1; i < right; i++) {
            maxBurst = Math.max(maxBurst, nums[left] * nums[i] * nums[right]
                    + burst(nums, left, i, memo) + burst(nums, i, right, memo));
        }
        memo[left][right] = maxBurst;
        return maxBurst;
    }
}
