package first;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SurroundedRegionsTest {
    private SurroundedRegions sol = new SurroundedRegions();

    @Test
    public void test01() {
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        sol.solve(board);
        for (char[] row : board)
            System.out.println(Arrays.toString(row));
    }

    @Test
    public void test02() {
        char[][] board = new char[][]{
                {'X', 'O', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'O', 'X', 'X', 'O', 'X'},
                {'X', 'O', 'O', 'O', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'O', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X', 'X', 'X', 'O'},
        };
        sol.solve(board);
        for (char[] row : board)
            System.out.println(Arrays.toString(row));
    }

    @Test
    public void test03() {
        char[][] board = new char[][]{
                {'X', 'O'},
                {'X', 'X'}
        };
        sol.solve(board);
        for (char[] row : board)
            System.out.println(Arrays.toString(row));
    }

    @Test
    public void test04() {
        char[][] board = new char[][]{
                {'X', 'O'}
        };
        sol.solve(board);
        for (char[] row : board)
            System.out.println(Arrays.toString(row));
    }

    @Test
    public void test05() {
        char[][] board = new char[][]{
                {'X', 'X', 'X'},
                {'X', 'O', 'X'},
                {'O', 'X', 'X'}
        };
        sol.solve(board);
        for (char[] row : board)
            System.out.println(Arrays.toString(row));
    }

    @Test
    public void test06() {
        char[][] board = new char[][]{
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'O', 'X'},
                {'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'O', 'X'},
                {'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'O', 'X'}
        };
        sol.solve(board);
        for (char[] row : board)
            System.out.println(Arrays.toString(row));
    }
}
