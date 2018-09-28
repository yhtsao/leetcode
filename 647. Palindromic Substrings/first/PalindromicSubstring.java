package first;

public class PalindromicSubstring {
    public int countSubstrings(String s) {
        return countSubstringsDP(s);
    }

    private int countSubstringsDP(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 1;
        dp[0][0] = true;
        for (int i = 1; i < s.length(); i++) {
            dp[i][i] = true;
            dp[i][i - 1] = true;
            count++;
        }

        for (int len = 1; len < s.length(); len++) {
            for (int i = 0; i < s.length() - len; i++) {
                int j = i + len;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    count++;
                    dp[i][j] = true;
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return count;
    }
}
