package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestWordDistanceTest {
    private ShortestWordDistance sol = new ShortestWordDistance();

    @Test
    public void test01() {
        String[] words = new String[]{"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";
        int ans = 3;
        int res = sol.shortestDistance(words, word1, word2);
        Assertions.assertEquals(ans, res);

        word1 = "makes";
        word2 = "coding";
        ans = 1;
        res = sol.shortestDistance(words, word1, word2);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String[] words = new String[]{"x", "a", "x", "x", "x", "b", "x", "x", "b", "a"};
        String word1 = "a";
        String word2 = "b";
        int ans = 1;
        int res = sol.shortestDistance(words, word1, word2);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String[] words = new String[]{"a", "x", "x", "x", "b", "x", "a", "x", "x", "x", "x", "b"};
        String word1 = "a";
        String word2 = "b";
        int ans = 2;
        int res = sol.shortestDistance(words, word1, word2);
        Assertions.assertEquals(ans, res);
    }
}
