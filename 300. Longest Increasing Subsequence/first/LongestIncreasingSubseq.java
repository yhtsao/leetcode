package first;

public class LongestIncreasingSubseq {
    public int lengthOfLIS(int[] nums) {
        return lengthOfLISBinarySearch(nums);
    }

    private int lengthOfLISDP(int[] nums) {
        if (nums.length < 2) return nums.length;
        int[] dp = new int[nums.length];
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[j], dp[i]);
            }
            dp[i]++;
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }

    private int lengthOfLISBinarySearch(int[] nums) {
        if (nums.length < 2) return nums.length;
        // tails is an array storing the smallest tail
        // of all increasing subsequences with length i+1 in tails[i].
        int[] tails = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = 0, j = len;
            // binary search
            while (i != j) {
                int m = (i + j) / 2;
                if (num > tails[m])
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = num;
            if (i == len) len++;
        }
        return len;
    }
}
