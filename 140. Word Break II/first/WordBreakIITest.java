package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WordBreakIITest {
    private WordBreakII sol = new WordBreakII();

    @Test
    public void test01() {
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        List<String> ansList = Arrays.asList(
                "cats and dog",
                "cat sand dog");
        List<String> resList = sol.wordBreak(s, wordDict);
        Assertions.assertEquals(ansList.size(), resList.size());
        for (String ans : ansList)
            Assertions.assertTrue(resList.contains(ans));
    }

    @Test
    public void test02() {
        String s = "pineapplepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        List<String> ansList = Arrays.asList(
                "pine apple pen apple",
                "pineapple pen apple",
                "pine applepen apple");
        List<String> resList = sol.wordBreak(s, wordDict);
        Assertions.assertEquals(ansList.size(), resList.size());
        for (String ans : ansList)
            Assertions.assertTrue(resList.contains(ans));
    }

    @Test
    public void test03() {
        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        List<String> ansList = Arrays.asList();
        List<String> resList = sol.wordBreak(s, wordDict);
        Assertions.assertEquals(ansList.size(), resList.size());
        for (String ans : ansList)
            Assertions.assertTrue(resList.contains(ans));
    }
}
