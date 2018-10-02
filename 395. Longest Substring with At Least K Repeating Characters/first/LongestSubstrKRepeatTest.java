package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstrKRepeatTest {
    private LongestSubstrKRepeat kRepeat = new LongestSubstrKRepeat();

    @Test
    public void test01() {
        String s = "aaabb";
        int k = 3;
        int ans = 3;
        int res = kRepeat.longestSubstring(s, k);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String s = "ababbc";
        int k = 2;
        int ans = 5;
        int res = kRepeat.longestSubstring(s, k);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String s = "a";
        int k = 2;
        int ans = 0;
        int res = kRepeat.longestSubstring(s, k);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        String s = "abaabcdeeedde";
        int k = 2;
        int ans = 7;
        int res = kRepeat.longestSubstring(s, k);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        String s = "ababcddeedc";
        int k = 2;
        int ans = 11;
        int res = kRepeat.longestSubstring(s, k);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test06() {
        String s = "abc";
        int k = 2;
        int ans = 0;
        int res = kRepeat.longestSubstring(s, k);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test07() {
        String s = "abab";
        int k = 2;
        int ans = 4;
        int res = kRepeat.longestSubstring(s, k);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test08() {
        String s = "ababacb";
        int k = 3;
        int ans = 0;
        int res = kRepeat.longestSubstring(s, k);
        Assertions.assertEquals(ans, res);
    }
}
