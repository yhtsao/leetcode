package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordDistanceTest {

    @Test
    public void test01() {
        WordDistance wordDistance = new WordDistance(
                new String[]{"practice", "makes", "perfect", "coding", "makes"});
        Assertions.assertEquals(3, wordDistance.shortest("practice", "coding"));
        Assertions.assertEquals(1, wordDistance.shortest("makes", "coding"));
    }

    @Test
    public void test02() {
        String[] words = new String[]{"x", "a", "x", "x", "x", "b", "x", "x", "b", "a"};
        WordDistance wordDistance = new WordDistance(words);
        Assertions.assertEquals(1, wordDistance.shortest("a", "b"));
    }

    @Test
    public void test03() {
        String[] words = new String[]{"a", "x", "x", "x", "b", "x", "a", "x", "x", "x", "x", "b"};
        WordDistance wordDistance = new WordDistance(words);
        Assertions.assertEquals(2, wordDistance.shortest("a", "b"));
    }
}
