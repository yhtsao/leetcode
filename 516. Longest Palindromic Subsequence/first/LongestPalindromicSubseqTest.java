package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubseqTest {
    private LongestPalindromicSubseq solution = new LongestPalindromicSubseq();

    @Test
    public void test01() {
        String s = "bbbab";
        int ans = 4;
        int result = solution.longestPalindromeSubseq(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        String s = "cbbd";
        int ans = 2;
        int result = solution.longestPalindromeSubseq(s);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        String s = "badbcab";
        int ans = 5;
        int result = solution.longestPalindromeSubseq(s);
        Assertions.assertEquals(ans, result);
    }
}
