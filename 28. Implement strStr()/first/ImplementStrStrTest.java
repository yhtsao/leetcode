package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImplementStrStrTest {
    private ImplementStrStr implementStrStr = new ImplementStrStr();

    @Test
    public void test01() {
        String haystack = "hello";
        String needle = "ll";
        int result = implementStrStr.strStr(haystack, needle);
        Assertions.assertEquals(haystack.indexOf(needle), result);
    }

    @Test
    public void test02() {
        String haystack = "hello";
        String needle = "elc";
        int result = implementStrStr.strStr(haystack, needle);
        Assertions.assertEquals(haystack.indexOf(needle), result);
    }

    @Test
    public void test03() {
        String haystack = "ababc";
        String needle = "abc";
        int result = implementStrStr.strStr(haystack, needle);
        Assertions.assertEquals(haystack.indexOf(needle), result);
    }

    @Test
    public void test04() {
        String haystack = "aabca";
        String needle = "abc";
        int result = implementStrStr.strStr(haystack, needle);
        Assertions.assertEquals(haystack.indexOf(needle), result);
    }

    @Test
    public void test05() {
        String haystack = "aabca";
        String needle = "";
        int result = implementStrStr.strStr(haystack, needle);
        Assertions.assertEquals(haystack.indexOf(needle), result);
    }

    @Test
    public void test06() {
        String haystack = "";
        String needle = "a";
        int result = implementStrStr.strStr(haystack, needle);
        Assertions.assertEquals(haystack.indexOf(needle), result);
    }
}
