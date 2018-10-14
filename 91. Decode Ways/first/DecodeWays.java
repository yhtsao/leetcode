package first;

public class DecodeWays {
    public int numDecodings(String s) {
        if (s.isEmpty() || s.charAt(0) == '0') return 0;
        int[] dp = new int[s.length() + 1];
        dp[dp.length - 1] = 1;
        dp[dp.length - 2] = s.charAt(s.length() - 1) == '0' ? 0 : 1;

        for (int i = s.length() - 2, j = dp.length - 3; i >= 0; i--, j--) {
            if (s.charAt(i) == '0') {
                dp[j] = 0;
                continue;
            }
            dp[j] += dp[j + 1];
            int number = (s.charAt(i) - '0') * 10 + s.charAt(i + 1) - '0';
            if (number <= 26) {
                dp[j] += dp[j + 2];
            }
        }

        return dp[0];
    }

    private int recur(String s, int start) {
        if (start >= s.length()) return 1;
        if (s.charAt(start) == '0') return 0;
        int count = recur(s, start + 1);

        if (start + 1 < s.length()) {
            int number = (s.charAt(start) - '0') * 10 + s.charAt(start + 1) - '0';
            if (number <= 26)
                count += recur(s, start + 2);
        }

        return count;
    }
}
