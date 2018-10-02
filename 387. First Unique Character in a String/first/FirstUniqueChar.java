package first;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        int firstUnique = 0;
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            if (s.charAt(i) == s.charAt(firstUnique)) {
                while (firstUnique <= i && chars[s.charAt(firstUnique) - 'a'] > 1) {
                    firstUnique++;
                }
            }
        }
        return firstUnique == s.length() ? -1 : firstUnique;
    }
}
