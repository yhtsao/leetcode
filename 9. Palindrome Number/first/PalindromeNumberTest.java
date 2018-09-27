package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    private PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void test01() {
        int x = 121;
        Assertions.assertTrue(palindromeNumber.isPalindrome(x));
    }

    @Test
    public void test02() {
        int x = -121;
        Assertions.assertFalse(palindromeNumber.isPalindrome(x));
    }

    @Test
    public void test03() {
        int x = 22;
        Assertions.assertTrue(palindromeNumber.isPalindrome(x));
    }

    @Test
    public void test04() {
        int x = 1;
        Assertions.assertTrue(palindromeNumber.isPalindrome(x));
    }

    @Test
    public void test05() {
        int x = 1214;
        Assertions.assertFalse(palindromeNumber.isPalindrome(x));
    }
}
