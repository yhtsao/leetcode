package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsomorphicStringTest {
    private IsomorphicString isomorphicString = new IsomorphicString();

    @Test
    public void test01() {
        String s = "egg";
        String t = "add";

        boolean result = isomorphicString.isIsomorphic(s, t);
        Assertions.assertTrue(result);
    }

    @Test
    public void test02() {
        String s = "paper";
        String t = "title";

        boolean result = isomorphicString.isIsomorphic(s, t);
        Assertions.assertTrue(result);
    }

    @Test
    public void test03() {
        String s = "foo";
        String t = "bar";

        boolean result = isomorphicString.isIsomorphic(s, t);
        Assertions.assertFalse(result);
    }

    @Test
    public void test04() {
        String s = "abba";
        String t = "baab";

        boolean result = isomorphicString.isIsomorphic(s, t);
        Assertions.assertTrue(result);
    }

    @Test
    public void test05() {
        String s = "eg";
        String t = "add";

        boolean result = isomorphicString.isIsomorphic(s, t);
        Assertions.assertFalse(result);
    }

    @Test
    public void test06() {
        String s = "";
        String t = "";

        boolean result = isomorphicString.isIsomorphic(s, t);
        Assertions.assertTrue(result);
    }

    @Test
    public void test07() {
        String s = "ab";
        String t = "aa";

        boolean result = isomorphicString.isIsomorphic(s, t);
        Assertions.assertFalse(result);
    }
}
