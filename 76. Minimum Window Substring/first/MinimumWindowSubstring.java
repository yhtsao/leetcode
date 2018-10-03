package first;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int start = 0, end = 0;
        int startOfMinLen = 0, minLen = Integer.MAX_VALUE;
        int count = t.length();
        int[] map = new int[256];

        // initial map for string t
        for (char c : t.toCharArray()) map[c]++;

        for (end = 0; end < s.length(); end++) {
            if (map[s.charAt(end)]-- > 0) count--;

            while (count == 0) {
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    startOfMinLen = start;
                }
                if (map[s.charAt(start++)]++ == 0) count++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startOfMinLen, startOfMinLen + minLen);
    }
}
