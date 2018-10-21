package first;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        for (char c : s.toCharArray())
            map[c - 'a']++;

        int len = s.length();
        for (char c : t.toCharArray()) {
            if (map[c - 'a']-- > 0) len--;
            else return false;
        }

        return len == 0 ? true : false;
    }
}
