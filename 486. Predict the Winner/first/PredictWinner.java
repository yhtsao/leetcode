package first;

public class PredictWinner {
    public boolean PredictTheWinnerMinMax(int[] nums) {
        return canWin(nums, 0, nums.length - 1, 0, 0, true);
    }

    private boolean canWin(int[] nums, int lo, int hi, int sum1, int sum2, boolean isPlayer1) {
        if (lo > hi) return sum1 >= sum2;
        if (lo == hi) {
            if (isPlayer1) return sum1 + nums[lo] >= sum2;
            else return sum2 + nums[lo] > sum1;
        }

        if (isPlayer1) { // if one of situations that player2 lose, player1 win
            return !canWin(nums, lo + 1, hi, sum1 + nums[lo], sum2, !isPlayer1)
                    || !canWin(nums, lo, hi - 1, sum1 + nums[hi], sum2, !isPlayer1);
        } else {
            return !canWin(nums, lo + 1, hi, sum1, sum2 + nums[lo], !isPlayer1)
                    || !canWin(nums, lo, hi - 1, sum1, sum2 + nums[hi], !isPlayer1);
        }
    }

    public boolean PredictTheWinnerRecurWithMemo(int[] nums) {
        return canWin(nums, 0, nums.length - 1, new Integer[nums.length][nums.length]) >= 0;

    }

    private int canWin(int[] nums, int lo, int hi, Integer[][] memo) {
        if (memo[lo][hi] == null)
            memo[lo][hi] = lo == hi ? nums[lo] :
                    Math.max(nums[lo] - canWin(nums, lo + 1, hi, memo), nums[hi] - canWin(nums, lo, hi - 1, memo));
        return memo[lo][hi];
    }

    // dp[i][j] = max(nums[i] + min(dp[i + 2][j], dp[i + 1][j - 1]),
    //                nums[j] + min(dp[i + 1][j - 1], dp[i][j - 2]))
    public boolean PredictTheWinnerDP(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i][i] = nums[i];
            sum += nums[i];
        }

        for (int j = 0; j < nums.length; j++) {
            for (int i = j - 1; i >= 0; i--) {
                int a = dp[i + 1][j - 1];
                int b = i < nums.length - 2 ? dp[i + 2][j] : 0;
                int c = j > 1 ? dp[i][j - 2] : 0;

                dp[i][j] = Math.max(Math.min(a, b) + nums[i], Math.min(a, c) + nums[j]);
            }
        }

        return dp[0][nums.length - 1] * 2 >= sum;
    }
}
