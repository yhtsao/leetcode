import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FindAnagramInStringTest {
    @Test
    public void test01() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = Arrays.asList(0, 6);
        FindAnagramInString findAnagramInString = new FindAnagramInString();
        List<Integer> result = findAnagramInString.findAnagrams(s, p);
        Assertions.assertEquals(ans.toString(), result.toString());
    }

    @Test
    public void test02() {
        String s = "abab";
        String p = "ab";
        List<Integer> ans = Arrays.asList(0, 1, 2);
        FindAnagramInString findAnagramInString = new FindAnagramInString();
        List<Integer> result = findAnagramInString.findAnagrams(s, p);
        Assertions.assertEquals(ans.toString(), result.toString());
    }
}
