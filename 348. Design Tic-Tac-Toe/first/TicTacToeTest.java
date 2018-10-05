package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {
    @Test
    public void test01() {
        TicTacToe toe = new TicTacToe(3);
        Assertions.assertEquals(0, toe.move(0, 0, 1));
        Assertions.assertEquals(0, toe.move(0, 2, 2));
        Assertions.assertEquals(0, toe.move(2, 2, 1));
        Assertions.assertEquals(0, toe.move(1, 1, 2));
        Assertions.assertEquals(0, toe.move(2, 0, 1));
        Assertions.assertEquals(0, toe.move(1, 0, 2));
        Assertions.assertEquals(1, toe.move(2, 1, 1));
    }

    @Test
    public void test02() {
        TicTacToe toe = new TicTacToe(3);
        int[][] moves = new int[][]{
                new int[]{0, 0, 1},
                new int[]{1, 1, 2},
                new int[]{1, 0, 1},
                new int[]{0, 2, 2},
                new int[]{2, 0, 1}
        };
        int i;
        for (i = 0; i < moves.length - 1; i++) {
            Assertions.assertEquals(0, toe.move(moves[i][0], moves[i][1], moves[i][2]));
        }
        Assertions.assertEquals(moves[i][2], toe.move(moves[i][0], moves[i][1], moves[i][2]));
    }

    @Test
    public void test03() {
        TicTacToe toe = new TicTacToe(3);
        int[][] moves = new int[][]{
                new int[]{1, 1, 1},
                new int[]{0, 2, 2},
                new int[]{2, 2, 1},
                new int[]{0, 1, 2},
                new int[]{0, 0, 1}
        };
        int i;
        for (i = 0; i < moves.length - 1; i++) {
            Assertions.assertEquals(0, toe.move(moves[i][0], moves[i][1], moves[i][2]));
        }
        Assertions.assertEquals(moves[i][2], toe.move(moves[i][0], moves[i][1], moves[i][2]));
    }

    @Test
    public void test04() {
        TicTacToe toe = new TicTacToe(3);
        int[][] moves = new int[][]{
                new int[]{1, 0, 1},
                new int[]{2, 0, 2},
                new int[]{1, 2, 1},
                new int[]{1, 1, 2},
                new int[]{2, 2, 1},
                new int[]{0, 2, 2}
        };
        int i;
        for (i = 0; i < moves.length - 1; i++) {
            Assertions.assertEquals(0, toe.move(moves[i][0], moves[i][1], moves[i][2]));
        }
        Assertions.assertEquals(moves[i][2], toe.move(moves[i][0], moves[i][1], moves[i][2]));
    }
}
