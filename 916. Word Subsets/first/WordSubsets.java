package first;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] charInB = new int[26];
        for (String b : B) {
            int[] tmpCharSet = counter(b);
            for (int i = 0; i < 26; i++)
                charInB[i] = Math.max(charInB[i], tmpCharSet[i]);
        }

        List<String> res = new ArrayList<>();
        for (String a : A) {
            int[] tmpCharSet = counter(a);
            int i;
            for (i = 0; i < 26; i++)
                if (tmpCharSet[i] < charInB[i]) break;
            if (i == 26) res.add(a);
        }
        return res;
    }

    private int[] counter(String str) {
        int[] chars = new int[26];
        for (char c : str.toCharArray())
            chars[c - 'a']++;
        return chars;
    }
}
