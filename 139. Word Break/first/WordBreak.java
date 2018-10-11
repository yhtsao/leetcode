package first;

import java.util.List;

public class WordBreak {
    class Trie {
        Trie[] nodes;
        boolean isWord;

        Trie() {
            nodes = new Trie[26];
        }
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakTrie(s, wordDict);
    }

    public boolean wordBreakTrie(String s, List<String> wordDict) {
        if (s.isEmpty()) return true;
        Trie root = buildTrie(wordDict);
        Trie cur;
        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            cur = root;
            for (int j = i; j < s.length() & cur != null; j++) {
                cur = cur.nodes[s.charAt(j) - 'a'];
                if (dp[j + 1] && cur != null && cur.isWord) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }

    private Trie buildTrie(List<String> words) {
        Trie root = new Trie();
        Trie cur;
        for (String word : words) {
            cur = root;
            for (char c : word.toCharArray()) {
                if (cur.nodes[c - 'a'] == null) cur.nodes[c - 'a'] = new Trie();
                cur = cur.nodes[c - 'a'];
            }
            cur.isWord = true;
        }
        return root;
    }

    public boolean wordBreakDP(String s, List<String> wordDict) {
        if (s.isEmpty()) return true;

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j >= 0; j--) {
                if (dp[j] && wordDict.contains(s.substring(j, i + 1))) {
                    dp[i + 1] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
