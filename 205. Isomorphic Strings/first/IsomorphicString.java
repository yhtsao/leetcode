package first;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        return isIsomorphicByMap(s, t);
    }

    public boolean isIsomorphicByMap(String s, String t) {
        int[] sPos = new int[256];
        int[] tPos = new int[256];

        for (int i = 0; i < s.length(); i++) {
            // Check last occurence position of s[i] and t[i]
            if (sPos[s.charAt(i)] != tPos[t.charAt(i)]) return false;

            // Update the last occurence position
            sPos[s.charAt(i)] = i + 1;
            tPos[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public boolean isIsomorphicByIndexOf(String s, String t) {
        if (s.length() != t.length()) return false;

        boolean[] isChecked = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (isChecked[i]) continue;
            for (int index = i; index >= 0; index = s.indexOf(s.charAt(index), index + 1)) {
                if (t.charAt(i) != t.charAt(index)) return false;
                isChecked[index] = true;
            }
            for (int index = i; index >= 0; index = t.indexOf(t.charAt(index), index + 1))
                if (s.charAt(i) != s.charAt(index)) return false;
        }
        return true;
    }
}
