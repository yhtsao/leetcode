package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WordLadderTest {
    private WordLadder sol = new WordLadder();

    @Test
    public void test01() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        int ans = 5;
        int res = sol.ladderLength(beginWord, endWord, wordList);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        int ans = 0;
        int res = sol.ladderLength(beginWord, endWord, wordList);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String beginWord = "hi";
        String endWord = "do";
        List<String> wordList = Arrays.asList("ti", "tu", "ha", "du", "do", "ta");
        int ans = 5;
        int res = sol.ladderLength(beginWord, endWord, wordList);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        String beginWord = "ca";
        String endWord = "ta";
        List<String> wordList = Arrays.asList("ti", "tu", "ca", "du", "do", "ta");
        int ans = 2;
        int res = sol.ladderLength(beginWord, endWord, wordList);
        Assertions.assertEquals(ans, res);
    }
}
