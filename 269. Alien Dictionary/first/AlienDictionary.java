package first;

import java.util.*;

public class AlienDictionary {
    class Letter {
        char val;
        int indegree;
        List<Letter> childs;

        Letter(char val) {
            this.val = val;
            this.indegree = 0;
            this.childs = new ArrayList<>();
        }
    }

    /**
     * @param words: a list of words
     * @return: a string which is correct order
     */
    public String alienOrder(String[] words) {
        if (words.length == 0) return "";

        Letter[] charset = new Letter[26];
        int numOfChar = 0;

        // build graph
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                if (charset[c - 'a'] == null) {
                    numOfChar++;
                    charset[c - 'a'] = new Letter(c);
                }
            }
        }
        String preWord = words[0];
        String curWord;
        for (int i = 1; i < words.length; i++) {
            curWord = words[i];
            int j = 0;
            int min = Math.min(preWord.length(), curWord.length());
            for (; j < min; j++) {
                if (preWord.charAt(j) != curWord.charAt(j)) {
                    charset[preWord.charAt(j) - 'a'].childs.add(charset[curWord.charAt(j) - 'a']);
                    charset[curWord.charAt(j) - 'a'].indegree++;
                    break;
                }
            }
            if (j == min && preWord.length() > curWord.length()) return "";
            preWord = curWord;
        }

        // Run BFS
        Queue<Letter> queue = new LinkedList<>();
        for (int i = 0; i < charset.length; i++)
            if (charset[i] != null && charset[i].indegree == 0)
                queue.offer(charset[i]);

        char[] res = new char[numOfChar];
        int count = 0;
        while (!queue.isEmpty()) {
            Letter c = queue.poll();
            res[count++] = c.val;
            for (Letter child : c.childs) {
                if (--child.indegree == 0)
                    queue.offer(child);
            }
        }


        return count == numOfChar ? new String(res) : new String();
    }
}
