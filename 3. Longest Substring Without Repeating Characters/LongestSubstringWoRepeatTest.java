import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWoRepeatTest {
    @Test
    public void test01() {
        LongestSubstringWoRepeat longestSubstringWoRepeat = new LongestSubstringWoRepeat();
        String s = "abcabcbb";
        int ans = 3;
        int result = longestSubstringWoRepeat.lengthOfLongestSubstring(s);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        LongestSubstringWoRepeat longestSubstringWoRepeat = new LongestSubstringWoRepeat();
        String s = "bbbbb";
        int ans = 1;
        int result = longestSubstringWoRepeat.lengthOfLongestSubstring(s);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        LongestSubstringWoRepeat longestSubstringWoRepeat = new LongestSubstringWoRepeat();
        String s = "pwwkew";
        int ans = 3;
        int result = longestSubstringWoRepeat.lengthOfLongestSubstring(s);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test04() {
        LongestSubstringWoRepeat longestSubstringWoRepeat = new LongestSubstringWoRepeat();
        String s = "aaaaabbbbb";
        int ans = 2;
        int result = longestSubstringWoRepeat.lengthOfLongestSubstring(s);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test05() {
        LongestSubstringWoRepeat longestSubstringWoRepeat = new LongestSubstringWoRepeat();
        String s = "";
        int ans = 0;
        int result = longestSubstringWoRepeat.lengthOfLongestSubstring(s);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test06() {
        LongestSubstringWoRepeat longestSubstringWoRepeat = new LongestSubstringWoRepeat();
        String s = "ab";
        int ans = 2;
        int result = longestSubstringWoRepeat.lengthOfLongestSubstring(s);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test07() {
        LongestSubstringWoRepeat longestSubstringWoRepeat = new LongestSubstringWoRepeat();
        String s = "dvdf";
        int ans = 3;
        int result = longestSubstringWoRepeat.lengthOfLongestSubstring(s);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test08() {
        LongestSubstringWoRepeat longestSubstringWoRepeat = new LongestSubstringWoRepeat();
        String s = "tmmzuxt";
        int ans = 5;
        int result = longestSubstringWoRepeat.lengthOfLongestSubstring(s);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test09() {
        LongestSubstringWoRepeat longestSubstringWoRepeat = new LongestSubstringWoRepeat();
        String s = "twzwabcdt";
        int ans = 7;
        int result = longestSubstringWoRepeat.lengthOfLongestSubstring(s);

        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test10() {
        LongestSubstringWoRepeat longestSubstringWoRepeat = new LongestSubstringWoRepeat();
        String s = "a";
        int ans = 1;
        int result = longestSubstringWoRepeat.lengthOfLongestSubstring(s);

        Assertions.assertEquals(ans, result);
    }
}
