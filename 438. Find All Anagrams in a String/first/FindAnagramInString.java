package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagramInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() < p.length()) return result;

        int[] map = new int[256];
        for (char c : p.toCharArray()) {
            map[c]++;
        }

        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            char curr = s.charAt(right);
            if (map[curr] > 0) {
                count--;
            }
            if (count == 0) result.add(left);

            map[curr]--;
            right++;
            if (right == left + p.length()) {
                if (map[s.charAt(left)] >= 0) {
                    count++;
                }
                map[s.charAt(left)]++;
                left++;

            }
        }
        return result;
    }

    public List<Integer> findAnagramsBruteForce(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() < p.length()) return result;

        char[] chars = p.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String subStr = s.substring(i, i + p.length());
            char[] subChars = subStr.toCharArray();
            Arrays.sort(subChars);
            if (Arrays.equals(chars, subChars)) result.add(i);
        }

        return result;
    }
}
