package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordSearchTest {
    private WordSearch sol = new WordSearch();

    @Test
    public void test01() {
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        Assertions.assertTrue(sol.exist(board, word));

        board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        word = "SEE";
        Assertions.assertTrue(sol.exist(board, word));

        board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        word = "ABCB";
        Assertions.assertFalse(sol.exist(board, word));
    }

    @Test
    public void test02() {
        char[][] board = new char[][]{
                {'A', 'A', 'B', 'E'}
        };
        String word = "AAB";
        Assertions.assertTrue(sol.exist(board, word));

        word = "ABA";
        Assertions.assertFalse(sol.exist(board, word));
    }

    @Test
    public void test03() {
        char[][] board = new char[][]{
                {'A', 'B', 'A', 'E'},
                {'B', 'A', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABAD";
        Assertions.assertTrue(sol.exist(board, word));

        board = new char[][]{
                {'A', 'B', 'A', 'E'},
                {'B', 'A', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        word = "ABACE";
        Assertions.assertTrue(sol.exist(board, word));

        board = new char[][]{
                {'A', 'B', 'A', 'E'},
                {'B', 'A', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        word = "ABAA";
        Assertions.assertFalse(sol.exist(board, word));
    }
}
