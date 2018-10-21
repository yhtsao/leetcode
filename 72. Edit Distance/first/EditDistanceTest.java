package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EditDistanceTest {
    EditDistance sol = new EditDistance();

    @Test
    public void test01() {
        String word1 = "abcd";
        String word2 = "acde";
        int ans = 2;
        int ret = sol.minDistance(word1, word2);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        String word1 = "horse";
        String word2 = "ros";
        int ans = 3;
        int ret = sol.minDistance(word1, word2);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        String word1 = "intention";
        String word2 = "execution";
        int ans = 5;
        int ret = sol.minDistance(word1, word2);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test04() {
        String word1 = "";
        String word2 = "a";
        int ans = 1;
        int ret = sol.minDistance(word1, word2);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test05() {
        String word1 = "";
        String word2 = "";
        int ans = 0;
        int ret = sol.minDistance(word1, word2);
        Assertions.assertEquals(ans, ret);
    }
}
