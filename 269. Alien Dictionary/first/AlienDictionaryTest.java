package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlienDictionaryTest {
    private AlienDictionary sol = new AlienDictionary();

    @Test
    public void test01() {
        String[] words = new String[]{
                "wrt",
                "wrf",
                "er",
                "ett",
                "rftt"
        };
        String ans = "wertf";
        String res = sol.alienOrder(words);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test02() {
        String[] words = new String[]{
                "z",
                "x"
        };
        String ans = "zx";
        String res = sol.alienOrder(words);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test03() {
        String[] words = new String[]{
                "z",
                "x",
                "z"
        };
        String ans = "";
        String res = sol.alienOrder(words);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test04() {
        String[] words = new String[]{
                "zx",
                "xa",
                "az"
        };
        String ans = "zxa";
        String res = sol.alienOrder(words);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test05() {
        String[] words = new String[]{
                "ac",
                "ab"
        };
        String ans = "acb";
        String res = sol.alienOrder(words);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test06() {
        String[] words = new String[]{
                "wab",
                "cd"
        };
        String ans = "abdwc";
        String res = sol.alienOrder(words);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test07() {
        String[] words = new String[]{
                "wrtkj",
                "wrt"
        }; // "wrt" is prefix of "wrtkj", so it should appear first
        String ans = "";
        String res = sol.alienOrder(words);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test08() {
        String[] words = new String[]{
                "caa", "aaa", "aab"
        };
        String ans = "cab";
        String res = sol.alienOrder(words);
        Assertions.assertTrue(ans.equals(res));
    }

    @Test
    public void test09() {
        String[] words = new String[]{
                "baa", "abcd", "abca", "cab", "cad"
        };
        String ans = "bdac";
        String res = sol.alienOrder(words);
        Assertions.assertTrue(ans.equals(res));
    }
}
