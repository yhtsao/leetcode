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

    public String alienOrderSol2(String[] words) {
        if (words.length == 0 || words[0].length() == 0) return "";

        // initialize indegree count of all nodes
        Map<Character, Integer> indegree = new HashMap<>();
        for (String word : words)
            for (char c : word.toCharArray()) indegree.put(c, 0);

        // build the graph
        Map<Character, Set<Character>> map = new HashMap<>();
        String prev = words[0];
        for (int i = 1; i < words.length; i++) {
            String curr = words[i];
            int minLen = Math.min(prev.length(), curr.length());
            for (int j = 0; j < minLen; j++) {
                if (curr.charAt(j) != prev.charAt(j)) {
                    map.putIfAbsent(prev.charAt(j), new HashSet<>());
                    if (map.get(prev.charAt(j)).contains(curr.charAt(j))) break;
                    map.get(prev.charAt(j)).add(curr.charAt(j));
                    indegree.put(curr.charAt(j), indegree.get(curr.charAt(j)) + 1);
                    break;
                }
            }
            prev = words[i];
        }

        // Run BFS to build order
        StringBuilder sb = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        for (Map.Entry<Character, Integer> entry : indegree.entrySet())
            if (entry.getValue() == 0) queue.offer(entry.getKey());

        while (!queue.isEmpty()) {
            char c = queue.poll();
            sb.append(c);
            if (!map.containsKey(c)) continue;
            Set<Character> neighbors = map.get(c);
            for (Character neighbor : neighbors) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);
                if (indegree.get(neighbor) == 0)
                    queue.offer(neighbor);
            }
        }
        return sb.length() == indegree.size() ? sb.toString() : "";
    }
}
