package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberIslandsTest {
    private NumberIslands sol = new NumberIslands();

    @Test
    public void test01() {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        int ans = 1;
        int ret = sol.numIslands(grid);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };
        int ans = 3;
        int ret = sol.numIslands(grid);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        char[][] grid = new char[][]{
                {'1'},
                {'1'}
        };
        int ans = 1;
        int ret = sol.numIslands(grid);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test04() {
        char[][] grid = new char[][]{
                {'1'},
                {'0'},
                {'1'}
        };
        int ans = 2;
        int ret = sol.numIslands(grid);
        Assertions.assertEquals(ans, ret);
    }
}
