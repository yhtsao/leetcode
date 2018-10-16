package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestIncreasingPathTest {
    private LongestIncreasingPath sol = new LongestIncreasingPath();

    @Test
    public void test01() {
        int[][] matrix = new int[][]{
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };
        int ans = 4;
        int res = sol.longestIncreasingPath(matrix);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        int[][] matrix = new int[][]{
                {3, 4, 5},
                {3, 2, 6},
                {2, 2, 1}
        };
        int ans = 4;
        int res = sol.longestIncreasingPath(matrix);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        int[][] matrix = new int[][]{
                {2, 3, 4, 5},
                {1, 2, 3, 6},
                {100, 101, 4, 1}
        };
        int ans = 6;
        int res = sol.longestIncreasingPath(matrix);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        int[][] matrix = new int[][]{
                {1, 2, 1}
        };
        int ans = 2;
        int res = sol.longestIncreasingPath(matrix);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        int[][] matrix = new int[][]{
                {1},
                {2},
                {1}
        };
        int ans = 2;
        int res = sol.longestIncreasingPath(matrix);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test06() {
        int[][] matrix = new int[][]{
                {1},
                {1}
        };
        int ans = 1;
        int res = sol.longestIncreasingPath(matrix);
        Assertions.assertEquals(ans, res);

        matrix = new int[][]{
                {1, 1, 1}
        };
        ans = 1;
        res = sol.longestIncreasingPath(matrix);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test07() {
        int[][] matrix = new int[][]{
                {1}
        };
        int ans = 1;
        int res = sol.longestIncreasingPath(matrix);
        Assertions.assertEquals(ans, res);
    }
}
