package first;

import java.util.*;

public class WordLadderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        Set<String> visited = new HashSet<>();
        List<List<String>> res = new ArrayList<>();
        Queue<List<String>> queue = new LinkedList<>();
        queue.offer(Arrays.asList(beginWord));
        visited.add(beginWord);
        while (!queue.isEmpty()) {
            int size = queue.size();
            Set<String> levelVisited = new HashSet<>(visited);
            while (size-- > 0) {
                List<String> curr = queue.poll();
                String parent = curr.get(curr.size() - 1);
                char[] chars = parent.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    for (char j = 'a'; j <= 'z'; j++) {
                        chars[i] = j;
                        String next = new String(chars);
                        if (dict.contains(next) && !visited.contains(next)) {
                            levelVisited.add(next);
                            List<String> childList = new ArrayList<>(curr);
                            childList.add(next);
                            if (next.equals(endWord))
                                res.add(childList);
                            else
                                queue.offer(childList);
                        }
                    }
                    chars[i] = c;
                }
            }
            visited = levelVisited;
        }
        return res;
    }
}
