package first;

public class InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        return isInterleaveDP(s1, s2, s3);
    }

    private boolean isInterleaveDP(String s1, String s2, String s3) {
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = s1.charAt(i - 1) == s3.charAt(i - 1) && dp[i - 1][0];
        }
        for (int i = 1; i <= s2.length(); i++) {
            dp[0][i] = s2.charAt(i - 1) == s3.charAt(i - 1) && dp[0][i - 1];
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                int k = i + j - 1;
                dp[i][j] = (s1.charAt(i - 1) == s3.charAt(k) && dp[i - 1][j])
                        || (s2.charAt(j - 1) == s3.charAt(k) && dp[i][j - 1]);
            }
        }
        return dp[s1.length()][s2.length()];
    }

    private boolean isInterleaveRecur(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        int[][] memo = new int[s1.length()][s2.length()];
        return recur(s1, 0, s2, 0, s3, 0, memo);
    }

    private boolean recur(String s1, int s1Ptr, String s2, int s2Ptr,
                          String s3, int s3Ptr, int[][] memo) {
        if (s1Ptr >= s1.length()) return s2.substring(s2Ptr).equals(s3.substring(s3Ptr));
        if (s2Ptr >= s2.length()) return s1.substring(s1Ptr).equals(s3.substring(s3Ptr));

        if (memo[s1Ptr][s2Ptr] != 0)
            return memo[s1Ptr][s2Ptr] == 1;

        boolean res = (s1.charAt(s1Ptr) == s3.charAt(s3Ptr) && recur(s1, s1Ptr + 1, s2, s2Ptr, s3, s3Ptr + 1, memo))
                | (s2.charAt(s2Ptr) == s3.charAt(s3Ptr) && recur(s1, s1Ptr, s2, s2Ptr + 1, s3, s3Ptr + 1, memo));
        memo[s1Ptr][s2Ptr] = res ? 1 : -1;
        return res;
    }
}
