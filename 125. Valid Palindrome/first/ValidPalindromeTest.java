package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    private ValidPalindrome sol = new ValidPalindrome();

    @Test
    public void test01() {
        String s = "A man, a plan, a canal: Panama";
        Assertions.assertTrue(sol.isPalindrome(s));
    }

    @Test
    public void test02() {
        String s = "race a car";
        Assertions.assertFalse(sol.isPalindrome(s));
    }

    @Test
    public void test03() {
        String s = "0P";
        Assertions.assertFalse(sol.isPalindrome(s));
    }
}
