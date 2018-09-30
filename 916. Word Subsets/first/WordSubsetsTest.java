package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class WordSubsetsTest {
    private WordSubsets wordSubsets = new WordSubsets();

    @Test
    public void test01() {
        String[] A = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = new String[]{"e", "o"};
        String[] ans = new String[]{"facebook", "google", "leetcode"};
        List<String> result = wordSubsets.wordSubsets(A, B);
        for (String str : ans) {
            Assertions.assertTrue(result.contains(str));
        }
    }

    @Test
    public void test02() {
        String[] A = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = new String[]{"l", "e"};
        String[] ans = new String[]{"apple", "google", "leetcode"};
        List<String> result = wordSubsets.wordSubsets(A, B);
        for (String str : ans) {
            Assertions.assertTrue(result.contains(str));
        }
    }

    @Test
    public void test03() {
        String[] A = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = new String[]{"e", "oo"};
        String[] ans = new String[]{"facebook", "google"};
        List<String> result = wordSubsets.wordSubsets(A, B);
        for (String str : ans) {
            Assertions.assertTrue(result.contains(str));
        }
    }

    @Test
    public void test04() {
        String[] A = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = new String[]{"lo", "eo"};
        String[] ans = new String[]{"google", "leetcode"};
        List<String> result = wordSubsets.wordSubsets(A, B);
        for (String str : ans) {
            Assertions.assertTrue(result.contains(str));
        }
    }

    @Test
    public void test05() {
        String[] A = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        String[] B = new String[]{"ec", "oc", "ceo"};
        String[] ans = new String[]{"facebook", "leetcode"};
        List<String> result = wordSubsets.wordSubsets(A, B);
        for (String str : ans) {
            Assertions.assertTrue(result.contains(str));
        }
    }
}
