public class WildcardMatch {
    public boolean isMatch(String s, String p) {
        return isMatchNonDP(s, p);
    }

    /**
     * DP Solution using 2D array
     */
    public boolean isMatchDP(String s, String p) {
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

    /**
     * O(mn) solution with constant space
     */
    public boolean isMatchNonDP(String s, String p) {
        int sPtr = 0, pPtr = 0;
        int wildcard = -1, ss = 0;
        while (sPtr < s.length()) {
            if (pPtr < p.length() &&
                    (s.charAt(sPtr) == p.charAt(pPtr) || p.charAt(pPtr) == '?')) {
                sPtr++;
                pPtr++;
            } else if (pPtr < p.length() && p.charAt(pPtr) == '*') {
                wildcard = pPtr++;
                ss = sPtr;
            } else if (wildcard >= 0) {
                pPtr = wildcard + 1;
                ss++;
                sPtr = ss;
            } else return false;
        }
        while (pPtr < p.length() && p.charAt(pPtr) == '*')
            pPtr++;
        return pPtr == p.length();
    }
}
