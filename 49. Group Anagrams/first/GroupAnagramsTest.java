package first;

import org.junit.jupiter.api.Test;

import java.util.List;

public class GroupAnagramsTest {
    private GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void test01() {
        String[] strs = new String[]{
                "eat", "tea", "tan", "ate", "nat", "bat"
        };
        List<List<String>> results = groupAnagrams.groupAnagrams(strs);
        for (List<String> result : results)
            System.out.println(result.toString());
    }

    @Test
    public void test02() {
        String[] strs = new String[]{
                "eat", "tea", "tan", "eaat", "ate", "nat", "taea"
        };
        List<List<String>> results = groupAnagrams.groupAnagrams(strs);
        for (List<String> result : results)
            System.out.println(result.toString());
    }
}
