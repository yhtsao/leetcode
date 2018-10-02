package first;

public class CountUniquePalindrome {
    public int countPalindromicSubsequences(String S) {
        final int mod = (int) Math.pow(10, 9) + 7;
        int[][] dp = new int[S.length()][S.length()];
        for (int i = 0; i < S.length(); i++) {
            dp[i][i] = 1;
        }

        char[] chars = S.toCharArray();
        for (int len = 1; len < S.length(); len++) {
            for (int i = 0; i < S.length() - len; i++) {
                int j = i + len;
                if (chars[i] != chars[j]) {
                    /*
                     * ex: dp['abcd'] = dp['abc'] + dp['bcd'] - dp['bc']
                     * dp['abc'] = {'a', 'b', 'c'}
                     * dp['bcd'] = {'b', 'c', 'd'}
                     * dp['bc']  = {'b', 'c'}
                     */
                    dp[i][j] = dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1];
                } else {
                    int lo = i + 1;
                    int hi = j - 1;
                    while (lo <= hi && chars[lo] != chars[i]) lo++;
                    while (lo <= hi && chars[hi] != chars[i]) hi--;

                    if (lo > hi) {
                        /*
                        ex: dp['abca'] = dp['bc'] + {a + dp['bc'] + a} + {'aa', 'a}
                            dp['bc'] = {'b', 'c'}
                            {a + dp['bc'] + a} = {'aba', 'aca'}
                        */
                        dp[i][j] = dp[i + 1][j - 1] * 2 + 2;
                    } else if (lo == hi) {
                        /*
                        ex: dp['ababa'] = dp['bab'] + {a + dp['bab'] + a} + {'aa'}
                            dp['bab'] = {'a', 'b', 'bab'}
                            {a + dp['bab'] + a} = {'aaa', 'aba', 'ababa'}
                         */
                        dp[i][j] = dp[i + 1][j - 1] * 2 + 1;
                    } else {
                        /*
                        ex: dp['abacada'] = dp['bacad'] + {a + dp['bacad'] + a} - {a + dp['c'] + a}
                            dp['bacad'] = {'a', 'b', 'c', 'd', 'aca', 'aa'}
                            {a + dp['bacad'] + a} = {'aaa', 'aba', 'aca', 'ada', 'aacaa', 'aaaa'}
                            {a + dp['c'] + a} = {'aca'}
                         */
                        dp[i][j] = dp[i + 1][j - 1] * 2 - dp[lo + 1][hi - 1];
                    }
                }
                dp[i][j] = dp[i][j] < 0 ? dp[i][j] + mod : dp[i][j] % mod;
            }
        }

        return dp[0][S.length() - 1];
    }
}
