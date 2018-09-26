package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SnakesAndLaddersTest {
    private SnakesAndLadders snakesAndLadders = new SnakesAndLadders();

    @Test
    public void test01() {
        int[][] board = new int[][]{
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };
        int ans = 4;
        int result = snakesAndLadders.snakesAndLadders(board);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        int[][] board = new int[][]{
                {-1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1}
        };
        int ans = 4;
        int result = snakesAndLadders.snakesAndLadders(board);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        int[][] board = new int[][]{
                {4, -1},
                {-1, 3}
        };
        int ans = 1;
        int result = snakesAndLadders.snakesAndLadders(board);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test04() {
        int[][] board = new int[][]{
                {1, 1, -1},
                {1, 1, 1},
                {-1, 1, 1}
        };
        int ans = -1;
        int result = snakesAndLadders.snakesAndLadders(board);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test05() {
        int[][] board = new int[][]{
                {-1, -1},
                {-1, 1}
        };
        int ans = 1;
        int result = snakesAndLadders.snakesAndLadders(board);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test06() {
        int[][] board = new int[][]{
                {-1, -1, -1, 46, 47, -1, -1, -1},
                {51, -1, -1, 63, -1, 31, 21, -1},
                {-1, -1, 26, -1, -1, 38, -1, -1},
                {-1, -1, 11, -1, 14, 23, 56, 57},
                {11, -1, -1, -1, 49, 36, -1, 48},
                {-1, -1, -1, 33, 56, -1, 57, 21},
                {-1, -1, -1, -1, -1, -1, 2, -1},
                {-1, -1, -1, 8, 3, -1, 6, 56}
        };
        int ans = 4;
        int result = snakesAndLadders.snakesAndLadders(board);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test07() {
        int[][] board = new int[][]{
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, 34, -1, -1},
                {-1, -1, -1, -1, -1, 9}
        };
        int ans = 3;
        int result = snakesAndLadders.snakesAndLadders(board);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test08() {
        int[][] board = new int[][]{
                {-1, 11, 6, -1},
                {-1, 15, 16, -1},
                {-1, 7, -1, 8},
                {-1, -1, -1, 8}
        };
        int ans = 2;
        int result = snakesAndLadders.snakesAndLadders(board);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test09() {
        int[][] board = new int[][]{
                {-1, 1, 2, -1},
                {2, 13, 15, -1},
                {-1, 10, -1, -1},
                {-1, 6, 2, 8}
        };
        int ans = 2;
        int result = snakesAndLadders.snakesAndLadders(board);
        Assertions.assertEquals(ans, result);
    }

}
