package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringTwoDistinctCharTest {
    private LongestSubstringTwoDistinctChar solution = new LongestSubstringTwoDistinctChar();

    @Test
    public void test01() {
        String s = "eceba";
        int ans = 3;
        int res = solution.lengthOfLongestSubstringTwoDistinct(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        String s = "a";
        int ans = 0;
        int res = solution.lengthOfLongestSubstringTwoDistinct(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        String s = "abaacca";
        int ans = 5;
        int res = solution.lengthOfLongestSubstringTwoDistinct(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        String s = "abaccc";
        int ans = 4;
        int res = solution.lengthOfLongestSubstringTwoDistinct(s);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        String s = "abbbabaa";
        int ans = s.length();
        int res = solution.lengthOfLongestSubstringTwoDistinct(s);
        Assertions.assertEquals(ans, res);
    }

}
