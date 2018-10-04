package first;

public class LongestSubstringTwoDistinctChar {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        return lengthOfLongestSubstringKistinct(s, 2);
    }

    public int lengthOfLongestSubstringKistinct(String s, int k) {
        if (s.length() < k) return 0;
        int start = 0, end = 0;
        int maxLen = 0;
        int unique = 0;
        int[] map = new int[256];

        for (end = 0; end < s.length(); end++) {
            if (map[s.charAt(end)]++ == 0) unique++;

            while (unique > k) {
                if (--map[s.charAt(start++)] == 0) {
                    unique--;
                }
            }
            if (unique == k)
                maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
