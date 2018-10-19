package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortestWordDistanceIIITest {
    private ShortestWordDistanceIII sol = new ShortestWordDistanceIII();

    @Test
    public void test01() {
        String[] words = new String[]{"practice", "makes", "perfect", "coding", "makes"};
        //Assertions.assertEquals(1, sol.shortestWordDistance(words, "makes", "coding"));
        Assertions.assertEquals(3, sol.shortestWordDistance(words, "makes", "makes"));
    }

    @Test
    public void test02() {
        String[] words = new String[]{"x", "a", "x", "x", "x", "b", "x", "x", "b", "a", "b"};
        Assertions.assertEquals(1, sol.shortestWordDistance(words, "a", "b"));
        Assertions.assertEquals(2, sol.shortestWordDistance(words, "b", "b"));
    }

    @Test
    public void test03() {
        String[] words = new String[]{"a", "x", "x", "x", "b", "x", "a", "x", "a", "x", "x", "b"};
        Assertions.assertEquals(2, sol.shortestWordDistance(words, "a", "b"));
        Assertions.assertEquals(2, sol.shortestWordDistance(words, "a", "a"));
    }
}
