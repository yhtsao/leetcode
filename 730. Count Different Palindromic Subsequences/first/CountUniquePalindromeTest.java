package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountUniquePalindromeTest {
    private CountUniquePalindrome countPalindrome = new CountUniquePalindrome();

    @Test
    public void test01() {
        String s = "bccb";
        int ans = 6;
        int result = countPalindrome.countPalindromicSubsequences(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        String s = "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba";
        int ans = 104860361;
        int result = countPalindrome.countPalindromicSubsequences(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        String s = "abcd";
        int ans = 4;
        int result = countPalindrome.countPalindromicSubsequences(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test04() {
        String s = "abca";
        int ans = 6;
        int result = countPalindrome.countPalindromicSubsequences(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test05() {
        String s = "abaca";
        int ans = 7;
        int result = countPalindrome.countPalindromicSubsequences(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test06() {
        String s = "abacada";
        int ans = 11;
        int result = countPalindrome.countPalindromicSubsequences(s);
        Assertions.assertEquals(ans, result);
    }
}
