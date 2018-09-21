package first;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int lo = 0, minLo = 0, minLen = Integer.MAX_VALUE;
        int[] map = new int[256];
        for (char c : t.toCharArray())
            map[c]++;

        int count = t.length();
        for (int i = 0; i < s.length(); i++) {
            if (map[s.charAt(i)]-- > 0) {
                count--;
            }
            if (count == 0) {
                while (map[s.charAt(lo)]++ < 0) {
                    lo++;
                }
                if (i - lo + 1 < minLen) {
                    minLen = i - lo + 1;
                    minLo = lo;
                }
                count++;
                lo++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLo, minLo + minLen);
    }

}
