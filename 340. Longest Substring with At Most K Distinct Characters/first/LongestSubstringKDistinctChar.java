package first;

import java.util.HashMap;

public class LongestSubstringKDistinctChar {
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

    /**
     * For debug
     *
     * @param s
     * @param k
     * @return
     */
    public int correctAns(String s, int k) {
        if (s == null || s.length() == 0 || s.length() < k) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;
        int j = 0;
        int maxLen = 0;
        for (; i < s.length(); i++) {
            char curr = s.charAt(i);
            map.put(curr, i);
            if (map.size() > k) {
                int leftMost = Integer.MAX_VALUE;
                for (Character c : map.keySet()) {
                    leftMost = Math.min(leftMost, map.get(c));
                }
                map.remove(s.charAt(leftMost));
                j = leftMost + 1;
            }
            maxLen = Math.max(maxLen, i - j + 1);
        }
        return maxLen;
    }
}
