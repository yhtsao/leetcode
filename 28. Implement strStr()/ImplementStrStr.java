public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        return strStrBF(haystack, needle);
    }

    /**
     * Brute-force solution
     * O(mn): m is haystack length, n is needle length
     */
    public int strStrBF(String haystack, String needle) {
        int i = 0, j = 0;
        int start = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == 0) start = i;
                i++;
                j++;
            } else {
                start++;
                i = start;
                j = 0;
            }
        }
        return j == needle.length() ? start : -1;
    }
}
