import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegExMatchTest {
    @Test
    public void test01() {
        String s = "aa";
        String p = "a";
        RegExMatch regExMatch = new RegExMatch();
        Assertions.assertFalse(regExMatch.isMatch(s, p));
    }

    @Test
    public void test02() {
        String s = "aa";
        String p = "a*";
        RegExMatch regExMatch = new RegExMatch();
        Assertions.assertTrue(regExMatch.isMatch(s, p));
    }

    @Test
    public void test03() {
        String s = "ab";
        String p = ".*";
        RegExMatch regExMatch = new RegExMatch();
        Assertions.assertTrue(regExMatch.isMatch(s, p));

        s = "a";
        Assertions.assertTrue(regExMatch.isMatch(s, p));
    }

    @Test
    public void test04() {
        String s = "aab";
        String p = "c*a*b";
        RegExMatch regExMatch = new RegExMatch();
        Assertions.assertTrue(regExMatch.isMatch(s, p));

        s = "cacb";
        Assertions.assertFalse(regExMatch.isMatch(s, p));
    }

    @Test
    public void test05() {
        String s = "mississippi";
        String p = "mis*is*p*.";
        RegExMatch regExMatch = new RegExMatch();
        Assertions.assertFalse(regExMatch.isMatch(s, p));
    }

    @Test
    public void test06() {
        String s = "abbcb";
        String p = "a.*b";
        RegExMatch regExMatch = new RegExMatch();
        Assertions.assertTrue(regExMatch.isMatch(s, p));

        s = "ab";
        Assertions.assertTrue(regExMatch.isMatch(s, p));

        s = "acbc";
        Assertions.assertFalse(regExMatch.isMatch(s, p));
    }

    @Test
    public void test07() {
        String s = "a";
        String p = "a";
        RegExMatch regExMatch = new RegExMatch();
        Assertions.assertTrue(regExMatch.isMatch(s, p));
    }

    @Test
    public void test08() {
        String s = "a";
        String p = "ab*";
        RegExMatch regExMatch = new RegExMatch();
        Assertions.assertTrue(regExMatch.isMatch(s, p));
    }
}
