package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitionTest {
    private PalindromePartition sol = new PalindromePartition();

    @Test
    public void test01() {
        String s = "aab";
        List<List<String>> ans = new ArrayList<>();
        ans.add(Arrays.asList("a", "a", "b"));
        ans.add(Arrays.asList("aa", "b"));
        List<List<String>> ret = sol.partition(s);
        Assertions.assertTrue(ans.equals(ret));
    }

    @Test
    public void test02() {
        String s = "abab";
        List<List<String>> ans = new ArrayList<>();
        ans.add(Arrays.asList("a", "b", "a", "b"));
        ans.add(Arrays.asList("a", "bab"));
        ans.add(Arrays.asList("aba", "b"));
        List<List<String>> ret = sol.partition(s);
        Assertions.assertTrue(ans.equals(ret));
    }

    @Test
    public void test03() {
        String s = "";
        List<List<String>> ans = new ArrayList<>();
        List<List<String>> ret = sol.partition(s);
        Assertions.assertTrue(ans.equals(ret));
    }
}
