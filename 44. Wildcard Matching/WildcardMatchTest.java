import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WildcardMatchTest {
    private WildcardMatch wildcardMatch = new WildcardMatch();

    @Test
    public void test01() {
        String p = "a";
        String s = "aa";
        Assertions.assertFalse(wildcardMatch.isMatch(s, p));
    }

    @Test
    public void test02() {
        String p = "*";
        String s = "aa";
        Assertions.assertTrue(wildcardMatch.isMatch(s, p));

        s = "";
        Assertions.assertTrue(wildcardMatch.isMatch(s, p));
    }

    @Test
    public void test03() {
        String p = "?a";
        String s = "cb";
        Assertions.assertFalse(wildcardMatch.isMatch(s, p));
    }

    @Test
    public void test04() {
        String p = "*a*b";
        String s = "adceb";
        Assertions.assertTrue(wildcardMatch.isMatch(s, p));

        s = "ab";
        Assertions.assertTrue(wildcardMatch.isMatch(s, p));

        s = "xaxxbx";
        Assertions.assertFalse(wildcardMatch.isMatch(s, p));
    }

    @Test
    public void test05() {
        String p = "a*c?b";
        String s = "acdcb";
        Assertions.assertFalse(wildcardMatch.isMatch(s, p));
    }

    @Test
    public void test06() {
        String p = "a*b?";
        String s = "acdcb";
        Assertions.assertFalse(wildcardMatch.isMatch(s, p));

        s = "acba";
        Assertions.assertTrue(wildcardMatch.isMatch(s, p));
    }

}
