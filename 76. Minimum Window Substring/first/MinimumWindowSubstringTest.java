package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumWindowSubstringTest {
    @Test
    public void test01() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String ans = "BANC";

        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        String result = minimumWindowSubstring.minWindow(s, t);

        Assertions.assertEquals(ans, result);

    }

    @Test
    public void test02() {
        String s = "XXXABBBXACXABXC";
        String t = "ABBC";
        String ans = "BBXAC";

        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        String result = minimumWindowSubstring.minWindow(s, t);

        Assertions.assertEquals(ans, result);

    }

    @Test
    public void test03() {
        String s = "XXXABBBXACXABXC";
        String t = "ABCD";
        String ans = "";

        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        String result = minimumWindowSubstring.minWindow(s, t);

        Assertions.assertEquals(ans, result);

    }

    @Test
    public void test04() {
        String s = "";
        String t = "ABCD";
        String ans = "";

        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        String result = minimumWindowSubstring.minWindow(s, t);

        Assertions.assertEquals(ans, result);

    }
}
