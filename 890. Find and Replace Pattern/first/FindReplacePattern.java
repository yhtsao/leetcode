package first;

import java.util.ArrayList;
import java.util.List;

public class FindReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ret = new ArrayList<>();
        for (String word : words) {
            if (match(word, pattern)) ret.add(word);
        }
        return ret;
    }

    private boolean match(String word, String pattern) {
        int[] wCnt = new int[26], pCnt = new int[26];
        for (int i = 0; i < word.length(); i++) {
            if (wCnt[word.charAt(i) - 'a'] != pCnt[pattern.charAt(i) - 'a']) {
                return false;
            }
            // Give the character in this position with same number
            // word[i] = 'c', pattern[i] = 'a',
            // so wCnt['c'] = pCnt['a'] = i
            wCnt[word.charAt(i) - 'a'] = i + 1;
            pCnt[pattern.charAt(i) - 'a'] = i + 1;

        }
        return true;
    }
}
