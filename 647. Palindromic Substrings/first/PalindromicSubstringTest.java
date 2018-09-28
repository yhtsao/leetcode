package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromicSubstringTest {
    private PalindromicSubstring palindromicSubstring = new PalindromicSubstring();

    @Test
    public void test01() {
        // 'a', 'b', 'c'
        String s = "abc";
        int ans = 3;
        int result = palindromicSubstring.countSubstrings(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        // "a", "a", "a", "aa", "aa", "aaa"
        String s = "aaa";
        int ans = 6;
        int result = palindromicSubstring.countSubstrings(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        String s = "badbc";
        int ans = 5;
        int result = palindromicSubstring.countSubstrings(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test04() {
        String s = "aba";
        int ans = 4;
        int result = palindromicSubstring.countSubstrings(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test05() {
        String s = "a";
        int ans = 1;
        int result = palindromicSubstring.countSubstrings(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test06() {
        // "b", "a", "a", "b", "c", "aa", "baab"
        String s = "baabc";
        int ans = 7;
        int result = palindromicSubstring.countSubstrings(s);
        Assertions.assertEquals(ans, result);
    }
}
