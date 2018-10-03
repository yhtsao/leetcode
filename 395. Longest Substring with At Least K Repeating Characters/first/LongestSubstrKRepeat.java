package first;

public class LongestSubstrKRepeat {
    public int longestSubstring(String s, int k) {
        if (k < 2) return s.length();
        return longestSubstringTwoPtr(s, k);
    }

    private int longestSubstringDivide(String s, int k) {
        return recur(s, 0, s.length(), k);
    }

    private int recur(String s, int lo, int hi, int k) {
        if (hi - lo < k) return 0;

        int[] chars = new int[26];
        for (int i = lo; i < hi; i++)
            chars[s.charAt(i) - 'a']++;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 0 || chars[i] >= k) continue;

            for (int j = lo; j < hi; j++) {
                if (s.charAt(j) == (i + 'a')) {
                    int left = recur(s, lo, j, k);
                    int right = recur(s, j + 1, hi, k);
                    return Math.max(left, right);
                }
            }
        }
        return hi - lo;
    }

    private int longestSubstringTwoPtr(String s, int k) {
        int maxLen = 0;
        for (int i = 1; i <= 26; i++) {
            maxLen = Math.max(maxLen, longestSubstringWithNUniqueChar(s, k, i));
        }
        return maxLen;
    }

    /**
     * Find longest substring contains n unique characters
     * and the occurrence of each character is at least k times
     */
    private int longestSubstringWithNUniqueChar(String s, int k, int unique) {
        int start = 0, end = 0; // two pointers
        int[] map = new int[26];
        int maxLen = 0;
        int numNoLessThanK = 0; // number of characters occurs at least k times
        int currUnique = 0; // number of unique characters

        for (end = 0; end < s.length(); end++) {
            if (map[s.charAt(end) - 'a']++ == 0) currUnique++;
            if (map[s.charAt(end) - 'a'] == k) numNoLessThanK++;

            while (currUnique > unique) {
                if (map[s.charAt(start) - 'a']-- == k) numNoLessThanK--;
                if (map[s.charAt(start++) - 'a'] == 0) currUnique--;
            }

            if (currUnique == unique && numNoLessThanK == unique) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }

        return maxLen;
    }
}
