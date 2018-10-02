package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstUniqueCharTest {
    private FirstUniqueChar firstUniqueChar = new FirstUniqueChar();

    @Test
    public void test01() {
        String s = "leetcode";
        int ans = 0;
        int res = firstUniqueChar.firstUniqChar(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String s = "loveleetcode";
        int ans = 2;
        int res = firstUniqueChar.firstUniqChar(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String s = "eee";
        int ans = -1;
        int res = firstUniqueChar.firstUniqChar(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        String s = "aabb";
        int ans = -1;
        int res = firstUniqueChar.firstUniqChar(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        String s = "aab";
        int ans = 2;
        int res = firstUniqueChar.firstUniqChar(s);
        Assertions.assertEquals(ans, res);
    }
}
