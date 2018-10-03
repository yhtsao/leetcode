package first;

public class LongestSubstringWoRepeat {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length();

        boolean[] map = new boolean[256];
        int start = 0, end = 0;
        int maxLen = 0;
        for (end = 0; end < s.length(); end++) {
            if (map[s.charAt(end)]) {
                maxLen = Math.max(maxLen, end - start);
                while (s.charAt(start) != s.charAt(end)) {
                    map[s.charAt(start++)] = false;
                }
                start++;
            }
            map[s.charAt(end)] = true;
        }
        return Math.max(maxLen, end - start);
    }
}
