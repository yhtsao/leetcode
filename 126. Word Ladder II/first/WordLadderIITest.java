package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordLadderIITest {
    private WordLadderII sol = new WordLadderII();

    @Test
    public void test01() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog", "dit");
        List<List<String>> ans = new ArrayList<>();
        ans.add(Arrays.asList("hit", "hot", "dot", "dog", "cog"));
        ans.add(Arrays.asList("hit", "hot", "lot", "log", "cog"));
        List<List<String>> res = sol.findLadders(beginWord, endWord, wordList);
        for (List<String> list : ans) {
            Assertions.assertTrue(res.contains(list));
        }
    }

    @Test
    public void test02() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        List<List<String>> res = sol.findLadders(beginWord, endWord, wordList);
        Assertions.assertTrue(res.isEmpty());
    }
}
