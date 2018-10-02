package first;

public class LongestSubstrKRepeat {
    public int longestSubstring(String s, int k) {
        if (k < 2) return s.length();
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
}
