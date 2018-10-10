package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WordSearchIITest {
    private WordSearchII sol = new WordSearchII();

    @Test
    public void test01() {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String[] words = new String[]{
                "ABCCED",
                "SEE",
                "ABCB"
        };
        List<String> resList = sol.findWords(board, words);
        List<String> ans = Arrays.asList("ABCCED", "SEE");
        for (String res : resList)
            Assertions.assertTrue(ans.contains(res));
    }

    @Test
    public void test02() {
        char[][] board = new char[][]{
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'k', 'r'},
                {'i', 'f', 'l', 'v'}
        };
        String[] words = new String[]{"oath", "pea", "eat", "rain"
        };
        List<String> resList = sol.findWords(board, words);
        List<String> ans = Arrays.asList("eat", "oath");
        for (String res : resList)
            Assertions.assertTrue(ans.contains(res));
    }

    @Test
    public void test03() {
        char[][] board = new char[][]{
                {'a'}
        };
        String[] words = new String[]{"a"};
        List<String> resList = sol.findWords(board, words);
        List<String> ans = Arrays.asList("a");
        for (String res : resList)
            Assertions.assertTrue(ans.contains(res));
    }
}
