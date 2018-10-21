package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {
    ValidAnagram sol = new ValidAnagram();

    @Test
    public void test01() {
        String s = "anagram";
        String t = "nagaram";
        Assertions.assertTrue(sol.isAnagram(s, t));
    }

    @Test
    public void test02() {
        String s = "rat";
        String t = "car";
        Assertions.assertFalse(sol.isAnagram(s, t));
    }

    @Test
    public void test03() {
        String s = "a";
        String t = "ab";
        Assertions.assertFalse(sol.isAnagram(s, t));
    }
}
