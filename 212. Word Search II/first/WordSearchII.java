package first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchII {
    public List<String> findWords(char[][] board, String[] words) {
        return findWordsWithTrie(board, words);
    }

    // --------------------------------------------------------------------
    // find words with normal DFS method (backtracking)
    // --------------------------------------------------------------------
    public List<String> findWordsDFS(char[][] board, String[] words) {

        Set<String> res = new HashSet<>();
        for (String word : words) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (backtracking(board, i, j, word, 0)) {
                        res.add(word);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }

    private boolean backtracking(char[][] board, int row, int col, String word, int wordIndex) {
        if (wordIndex == word.length()) return true;
        if (row < 0 || col < 0 || row == board.length || col == board[0].length) return false;
        if (board[row][col] != word.charAt(wordIndex)) return false;

        char c = board[row][col];
        board[row][col] = ' ';
        if (backtracking(board, row - 1, col, word, wordIndex + 1)) {
            board[row][col] = c;
            return true;
        }
        if (backtracking(board, row + 1, col, word, wordIndex + 1)) {
            board[row][col] = c;
            return true;
        }
        if (backtracking(board, row, col + 1, word, wordIndex + 1)) {
            board[row][col] = c;
            return true;
        }
        if (backtracking(board, row, col - 1, word, wordIndex + 1)) {
            board[row][col] = c;
            return true;
        }
        board[row][col] = c;
        return false;
    }

    // --------------------------------------------------------------------
    // find words with trie
    // --------------------------------------------------------------------
    class Trie {
        Trie[] nodes;
        String word;

        Trie() {
            nodes = new Trie[26];
        }
    }

    public List<String> findWordsWithTrie(char[][] board, String[] words) {
        Trie root = buildTrie(words);
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, res);
            }
        }
        return res;
    }

    private Trie buildTrie(String[] words) {
        Trie root = new Trie();
        Trie cur;
        for (String word : words) {
            cur = root;
            for (char c : word.toCharArray()) {
                if (cur.nodes[c - 'a'] == null) cur.nodes[c - 'a'] = new Trie();
                cur = cur.nodes[c - 'a'];
            }
            cur.word = word;
        }
        return root;
    }

    private void dfs(char[][] board, int row, int col, Trie root, List<String> res) {
        char c = board[row][col];
        if (Character.isSpaceChar(c) || root.nodes[c - 'a'] == null) return;
        board[row][col] = ' ';
        root = root.nodes[c - 'a'];
        if (root.word != null) {
            res.add(root.word);
            root.word = null;
        }
        if (row > 0) dfs(board, row - 1, col, root, res);
        if (row < board.length - 1) dfs(board, row + 1, col, root, res);
        if (col > 0) dfs(board, row, col - 1, root, res);
        if (col < board[0].length - 1) dfs(board, row, col + 1, root, res);
        board[row][col] = c;
    }
}
