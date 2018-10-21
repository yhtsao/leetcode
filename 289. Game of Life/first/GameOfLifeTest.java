package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GameOfLifeTest {
    GameOfLife sol = new GameOfLife();

    @Test
    public void test01() {
        int[][] board = new int[][]{
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        int[][] ans = new int[][]{
                {0, 0, 0},
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };

        sol.gameOfLife(board);

        for (int i = 0; i < board.length; i++)
            Assertions.assertTrue(Arrays.equals(ans[i], board[i]));
    }
}
