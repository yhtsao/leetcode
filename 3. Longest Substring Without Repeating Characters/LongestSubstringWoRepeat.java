public class LongestSubstringWoRepeat {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256];
        int lo = 0, maxLen = 0;
        int i;
        for (i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map[c] > 0) { // already exist
                maxLen = Math.max(maxLen, i - lo);
                while (s.charAt(lo) != c) {
                    map[s.charAt(lo++)] = 0;
                }
                lo++;
            }
            map[c] = 1;
        }
        maxLen = Math.max(maxLen, i - lo);
        return maxLen;
    }
}
