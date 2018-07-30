public class WildcardMatch {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i <= s.length(); i++)
            dp[i][0] = false;
        for (int i = 1; i <= p.length(); i++)
            dp[0][i] = p.charAt(i - 1) == '*' ? dp[0][i - 1] : false;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1]         // match empty
                            || dp[i - 1][j - 1]     // match single char
                            || dp[i - 1][j];        // match multiple chars
                } else
                    dp[i][j] = (s.charAt(i - 1) == p.charAt(j - 1)
                            || p.charAt(j - 1) == '?') && dp[i - 1][j - 1];
            }
        }
        return dp[s.length()][p.length()];
    }
}
