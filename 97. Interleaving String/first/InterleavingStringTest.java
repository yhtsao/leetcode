package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterleavingStringTest {
    private InterleavingString interleavingString = new InterleavingString();

    @Test
    public void test01() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean result = interleavingString.isInterleave(s1, s2, s3);
        Assertions.assertTrue(result);
    }

    @Test
    public void test02() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        boolean result = interleavingString.isInterleave(s1, s2, s3);
        Assertions.assertFalse(result);
    }

    @Test
    public void test03() {
        String s1 = "aba";
        String s2 = "abc";
        String s3 = "aabcba";
        boolean result = interleavingString.isInterleave(s1, s2, s3);
        Assertions.assertTrue(result);

        s3 = "abbaac";
        result = interleavingString.isInterleave(s1, s2, s3);
        Assertions.assertFalse(result);
    }

    @Test
    public void test04() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        boolean result = interleavingString.isInterleave(s1, s2, s3);
        Assertions.assertTrue(result);

        s3 = "ba";
        result = interleavingString.isInterleave(s1, s2, s3);
        Assertions.assertTrue(result);
    }

    @Test
    public void test05() {
        String s1 = "";
        String s2 = "b";
        String s3 = "b";
        boolean result = interleavingString.isInterleave(s1, s2, s3);
        Assertions.assertTrue(result);
    }

    @Test
    public void test06() {
        String s1 = "b";
        String s2 = "";
        String s3 = "b";
        boolean result = interleavingString.isInterleave(s1, s2, s3);
        Assertions.assertTrue(result);
    }

    @Test
    public void test07() {
        String s1 = "";
        String s2 = "";
        String s3 = "";
        boolean result = interleavingString.isInterleave(s1, s2, s3);
        Assertions.assertTrue(result);
    }

    @Test
    public void test08() {
        String s1 = "aa";
        String s2 = "aba";
        String s3 = "abbaa";
        boolean result = interleavingString.isInterleave(s1, s2, s3);
        Assertions.assertFalse(result);
    }

    @Test
    public void test09() {
        String s1 = "aab";
        String s2 = "abc";
        String s3 = "aaabcb";
        boolean result = interleavingString.isInterleave(s1, s2, s3);
        Assertions.assertTrue(result);
    }
}
