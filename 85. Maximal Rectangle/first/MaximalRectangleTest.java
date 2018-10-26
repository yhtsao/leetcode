package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximalRectangleTest {
    MaximalRectangle sol = new MaximalRectangle();

    @Test
    public void test01() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        int ans = 6;
        Assertions.assertEquals(ans, sol.maximalRectangle(matrix));
    }

    @Test
    public void test02() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '0', '0'},
                {'1', '1', '1', '0', '0'}
        };
        int ans = 9;
        Assertions.assertEquals(ans, sol.maximalRectangle(matrix));
    }

    @Test
    public void test03() {
        char[][] matrix = new char[][]{
                {'1'}
        };
        int ans = 1;
        Assertions.assertEquals(ans, sol.maximalRectangle(matrix));
    }
}
