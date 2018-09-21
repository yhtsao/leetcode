package first;

public class RegExMatch {

    public boolean isMatch(String s, String p) {
        return isMatchDP(s, p);
    }

    public boolean isMatchDFS(String s, int startS, String p, int startP) {
        if (startP >= p.length())
            return (startS >= s.length());

        if (startP + 1 < p.length() && p.charAt(startP + 1) == '*') {
            while (startS < s.length()
                    && (s.charAt(startS) == p.charAt(startP) || p.charAt(startP) == '.')) {
                if (isMatchDFS(s, startS, p, startP + 2)) {
                    return true;
                }
                startS++;
            }
            return isMatchDFS(s, startS, p, startP + 2);
        } else {
            if (startS < s.length()
                    && (s.charAt(startS) == p.charAt(startP) || p.charAt(startP) == '.'))
                return isMatchDFS(s, startS + 1, p, startP + 1);
            return false;
        }
    }

    public boolean isMatchDP(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];

        dp[0][0] = true;
        for (int i = 1; i <= s.length(); i++)
            dp[i][0] = false;

        // d[0][j] == false iff p[j - 1] == '*' and p[0, .... j - 2] matches empty
        for (int j = 1; j <= p.length(); j++)
            dp[0][j] = p.charAt(j - 1) == '*' && dp[0][j - 2];

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (p.charAt(j - 1) != '*') {
                    dp[i][j] = dp[i - 1][j - 1]
                            && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.');
                } else {
                    if (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') {
                        // Three cases: a*
                        // 1. match empty a:    d[i][j-2]
                        // 2. match single a:   d[i][j-1]
                        // 3. match multiple a: d[i - 1][j]
                        dp[i][j] = dp[i][j - 2] || dp[i][j - 1] || dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 2];
                    }
                }
            }
        }

        return dp[s.length()][p.length()];
    }

}
