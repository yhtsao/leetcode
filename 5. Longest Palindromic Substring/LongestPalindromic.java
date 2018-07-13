public class LongestPalindromic {
    /**
     * Dynamic programming solution
     *
     * @param s
     * @return
     */
    public String longestPalindromeDP(String s) {
        int maxLen = 0;
        Boolean[][] palindrome = new Boolean[s.length()][s.length()];
        String result = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            palindrome[i][i] = true;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            palindrome[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
            if (palindrome[i][i + 1] && maxLen < 2) {
                maxLen = 2;
                result = s.substring(i, i + 2);
            }
        }

        for (int len = 2; len < s.length(); len++) {
            for (int i = 0; i < s.length() - len; i++) {
                palindrome[i][i + len] = (s.charAt(i) == s.charAt(i + len)
                        && palindrome[i + 1][i + len - 1]);
                if (palindrome[i][i + len] && maxLen < len + 1) {
                    maxLen = len + 1;
                    result = s.substring(i, i + len + 1);
                }

            }
        }

        return result;
    }

    /**
     * Brute-force solution
     *
     * @param s
     * @return
     */
    public String longestPalindromeBF(String s) {
        int maxLen = 0;
        String result = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindrome(s, i, j) && maxLen < j - i + 1) {
                    maxLen = j - i + 1;
                    result = s.substring(i, j + 1);
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String s, int lo, int hi) {
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
}
