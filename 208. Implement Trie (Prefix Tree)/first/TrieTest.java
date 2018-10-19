package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrieTest {

    @Test
    public void test() {
        Trie trie = new Trie();
        trie.insert("apple");
        Assertions.assertTrue(trie.search("apple"));   // returns true
        Assertions.assertFalse(trie.search("app"));     // returns false
        Assertions.assertTrue(trie.startsWith("app")); // returns true
        trie.insert("app");
        Assertions.assertTrue(trie.search("app"));     // returns true

        trie.insert("d");
        Assertions.assertTrue(trie.search("d"));
        Assertions.assertFalse(trie.startsWith("dfa"));
        Assertions.assertTrue(trie.startsWith("d"));
    }
}
