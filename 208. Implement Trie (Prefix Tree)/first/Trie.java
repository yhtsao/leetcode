package first;

public class Trie {
    Trie[] childs;
    boolean isWord;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        this.childs = new Trie[26];
        this.isWord = false;
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Trie curr = this;
        for (char c : word.toCharArray()) {
            if (curr.childs[c - 'a'] == null)
                curr.childs[c - 'a'] = new Trie();
            curr = curr.childs[c - 'a'];
        }
        curr.isWord = true;
    }

    private Trie traverse(String word) {
        Trie curr = this;
        for (char c : word.toCharArray()) {
            if (curr.childs[c - 'a'] == null) return null;
            curr = curr.childs[c - 'a'];
        }
        return curr;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Trie endNode = traverse(word);
        if (endNode != null && endNode.isWord) return true;
        return false;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        return traverse(prefix) != null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
