package first;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        return ladderLengthTwoEndBFS(beginWord, endWord, wordList);
    }

    private int ladderLengthOneEndBFS(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        visited.add(beginWord);
        char[] currChars;
        int count = 0;
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            while (size-- > 0) {
                if (queue.peek().equals(endWord)) return count;
                currChars = queue.poll().toCharArray();
                for (int i = 0; i < currChars.length; i++) {
                    char c = currChars[i];
                    for (char j = 'a'; j <= 'z'; j++) {
                        currChars[i] = j;
                        String nextStr = new String(currChars);
                        if (dict.contains(nextStr) && visited.add(nextStr))
                            queue.offer(nextStr);
                    }
                    currChars[i] = c;
                }
            }
        }
        return 0;
    }

    private int ladderLengthTwoEndBFS(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        Set<String> beginSet = new HashSet<>(), endSet = new HashSet<>();

        if (!dict.contains(endWord)) return 0;
        beginSet.add(beginWord);
        endSet.add(endWord);
        visited.add(beginWord);
        visited.add(endWord);
        int len = 0;
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            len++;
            Set<String> tmpSet = new HashSet<>();
            for (String word : beginSet) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    for (char j = 'a'; j <= 'z'; j++) {
                        chars[i] = j;
                        String next = new String(chars);
                        if (endSet.contains(next))
                            return len + 1;
                        if (dict.contains(next) && visited.add(next))
                            tmpSet.add(next);
                    }
                    chars[i] = c;
                }
            }
            if (tmpSet.size() >= endSet.size()) {
                beginSet = tmpSet;
            } else {
                beginSet = endSet;
                endSet = tmpSet;
            }
        }

        return 0;
    }
}
