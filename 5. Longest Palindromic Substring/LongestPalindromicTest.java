import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicTest {

    @Test
    public void test01() {
        LongestPalindromic longestPalindromic = new LongestPalindromic();
        String s = "babad";
        String ans = "bab";
        String result;

        result = longestPalindromic.longestPalindromeBF(s);
        Assertions.assertEquals(ans, result);

        result = longestPalindromic.longestPalindromeDP(s);
        Assertions.assertEquals(ans, result);

    }

    @Test
    public void test02() {
        LongestPalindromic longestPalindromic = new LongestPalindromic();
        String s = "cbbd";
        String ans = "bb";
        String result;

        result = longestPalindromic.longestPalindromeBF(s);
        Assertions.assertEquals(ans, result);

        result = longestPalindromic.longestPalindromeDP(s);
        Assertions.assertEquals(ans, result);

    }

    @Test
    public void test03() {
        LongestPalindromic longestPalindromic = new LongestPalindromic();
        String s = "abaabcd";
        String ans = "baab";
        String result;

        result = longestPalindromic.longestPalindromeBF(s);
        Assertions.assertEquals(ans, result);

        result = longestPalindromic.longestPalindromeDP(s);
        Assertions.assertEquals(ans, result);

    }

    @Test
    public void test04() {
        LongestPalindromic longestPalindromic = new LongestPalindromic();
        String s = "a";
        String ans = "a";
        String result;

        result = longestPalindromic.longestPalindromeBF(s);
        Assertions.assertEquals(ans, result);

        result = longestPalindromic.longestPalindromeDP(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test05() {
        LongestPalindromic longestPalindromic = new LongestPalindromic();
        String s = "abc";
        String ans = "a";
        String result;

        result = longestPalindromic.longestPalindromeBF(s);
        Assertions.assertEquals(ans, result);

        result = longestPalindromic.longestPalindromeDP(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test06() {
        LongestPalindromic longestPalindromic = new LongestPalindromic();
        String s = "cbabbabdx";
        String ans = "babbab";
        String result;

        result = longestPalindromic.longestPalindromeBF(s);
        Assertions.assertEquals(ans, result);

        result = longestPalindromic.longestPalindromeDP(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test07() {
        LongestPalindromic longestPalindromic = new LongestPalindromic();
        String s = "bbb";
        String ans = "bbb";
        String result;

        result = longestPalindromic.longestPalindromeBF(s);
        Assertions.assertEquals(ans, result);

        result = longestPalindromic.longestPalindromeDP(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test08() {
        LongestPalindromic longestPalindromic = new LongestPalindromic();
        String s = "bbbb";
        String ans = "bbbb";
        String result;

        result = longestPalindromic.longestPalindromeBF(s);
        Assertions.assertEquals(ans, result);

        result = longestPalindromic.longestPalindromeDP(s);
        Assertions.assertEquals(ans, result);
    }
}
