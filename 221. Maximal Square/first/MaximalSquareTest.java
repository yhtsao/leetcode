package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximalSquareTest {
    MaximalSquare sol = new MaximalSquare();

    @Test
    public void test01() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        int ans = 4;
        Assertions.assertEquals(ans, sol.maximalSquare(matrix));
    }

    @Test
    public void test02() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0', '1', '1', '1', '0'},
                {'1', '1', '1', '0', '0', '0', '0', '0', '1'},
                {'0', '0', '1', '1', '0', '0', '0', '1', '1'},
                {'0', '1', '1', '0', '0', '1', '0', '0', '1'},
                {'1', '1', '0', '1', '1', '0', '0', '1', '0'},
                {'0', '1', '1', '1', '1', '1', '1', '0', '1'},
                {'1', '0', '1', '1', '1', '0', '0', '1', '0'},
                {'1', '1', '1', '0', '1', '0', '0', '0', '1'},
                {'0', '1', '1', '1', '1', '0', '0', '1', '0'},
                {'1', '0', '0', '1', '1', '1', '0', '0', '0'}
        };
        int ans = 4;
        Assertions.assertEquals(ans, sol.maximalSquare(matrix));
    }
}
