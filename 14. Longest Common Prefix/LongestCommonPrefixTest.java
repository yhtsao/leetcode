import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void test01() {
        String[] strings = new String[]{"flower", "flow", "flight"};
        String ans = "fl";
        Assertions.assertTrue(ans.equals(longestCommonPrefix.longestCommonPrefix(strings)));
    }

    @Test
    public void test02() {
        String[] strings = new String[]{"dog", "racecar", "car"};
        String ans = "";
        Assertions.assertTrue(ans.equals(longestCommonPrefix.longestCommonPrefix(strings)));
    }

    @Test
    public void test03() {
        String[] strings = new String[]{"dog", "", "car"};
        String ans = "";
        Assertions.assertTrue(ans.equals(longestCommonPrefix.longestCommonPrefix(strings)));
    }

    @Test
    public void test04() {
        String[] strings = new String[]{"dog"};
        String ans = "dog";
        Assertions.assertTrue(ans.equals(longestCommonPrefix.longestCommonPrefix(strings)));
    }

    @Test
    public void test05() {
        String[] strings = new String[]{};
        String ans = "";
        Assertions.assertTrue(ans.equals(longestCommonPrefix.longestCommonPrefix(strings)));
    }
}
