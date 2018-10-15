package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SentenceScreenFittingTest {
    private SentenceScreenFitting sol = new SentenceScreenFitting();

    @Test
    public void test01() {
        String[] sentence = new String[]{"hello", "world"};
        int rows = 2, cols = 8;
        int ans = 1;
        int res = sol.wordsTyping(sentence, rows, cols);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String[] sentence = new String[]{"a", "bcd", "e"};
        int rows = 3, cols = 6;
        int ans = 2;
        int res = sol.wordsTyping(sentence, rows, cols);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String[] sentence = new String[]{"I", "had", "apple", "pie"};
        int rows = 4, cols = 5;
        int ans = 1;
        int res = sol.wordsTyping(sentence, rows, cols);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        String[] sentence = new String[]{"I", "eat", "yo"};
        int rows = 4, cols = 20;
        int ans = 8;
        int res = sol.wordsTyping(sentence, rows, cols);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        String[] sentence = new String[]{"I", "eat", "yo"};
        int rows = 5, cols = 7;
        int ans = 3;
        int res = sol.wordsTyping(sentence, rows, cols);
        Assertions.assertEquals(ans, res);
    }
}
