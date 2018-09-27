package first;

public class LongestPalindromicSubseq {
    public int longestPalindromeSubseq(String s) {
        return longestPalindromeSubseqDP(s);
    }

    private int longestPalindromeSubseqDP(String s) {
        if (s.length() <= 1) return s.length();

        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++)
            dp[i][i] = 1;

        int len = 1;
        while (len < s.length()) {
            for (int i = 0; i < s.length() - len; i++) {
                if (s.charAt(i) == s.charAt(i + len)) {
                    dp[i][i + len] = 2 + dp[i + 1][i + len - 1];
                } else {
                    dp[i][i + len] = Math.max(dp[i][i + len - 1], dp[i + 1][i + len]);
                }
            }
            len++;
        }
        return dp[0][s.length() - 1];
    }
}
