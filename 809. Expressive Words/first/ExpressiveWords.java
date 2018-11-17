package first;

public class ExpressiveWords {
    // time: O(N * (S.length + word.length)), space: O(1)
    // N is number of words
    public int expressiveWords(String S, String[] words) {
        int cnt = 0;
        for (String word : words) {
            if (isMatch(S, word)) cnt++;
        }

        return cnt;
    }

    boolean isMatch(String s, String word) {
        int i, j;
        for (i = 0, j = 0; i < word.length() && j < s.length(); ) {
            if (word.charAt(i) != s.charAt(j)) return false;
            char c = word.charAt(i);

            // count number of c appears in word
            int cntWord = 0;
            while (i < word.length() && word.charAt(i) == c) {
                cntWord++;
                i++;
            }

            // count number of c appears in s
            int cntS = 0;
            while (j < s.length() && s.charAt(j) == c) {
                cntS++;
                j++;
            }

            if (cntWord != cntS && (cntS < 3 || cntS < cntWord)) return false;
        }
        return i == word.length() && j == s.length();
    }
}
