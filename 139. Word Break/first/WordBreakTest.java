package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WordBreakTest {
    private WordBreak sol = new WordBreak();

    @Test
    public void test01() {
        String s = "abc";
        List<String> wordDict = Arrays.asList("a", "bc", "abcd");
        Assertions.assertTrue(sol.wordBreak(s, wordDict));
    }

    @Test
    public void test02() {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        Assertions.assertTrue(sol.wordBreak(s, wordDict));
    }

    @Test
    public void test03() {
        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen");
        Assertions.assertTrue(sol.wordBreak(s, wordDict));
    }

    @Test
    public void test04() {
        String s = "";
        List<String> wordDict = Arrays.asList("a");
        Assertions.assertTrue(sol.wordBreak(s, wordDict));

        s = "aa";
        Assertions.assertTrue(sol.wordBreak(s, wordDict));

        s = "aab";
        Assertions.assertFalse(sol.wordBreak(s, wordDict));

        s = "a";
        Assertions.assertTrue(sol.wordBreak(s, wordDict));
    }

    @Test
    public void test05() {
        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        Assertions.assertFalse(sol.wordBreak(s, wordDict));
    }
}
