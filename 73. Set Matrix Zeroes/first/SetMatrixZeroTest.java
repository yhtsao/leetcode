package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SetMatrixZeroTest {
    private SetMatrixZero sol = new SetMatrixZero();

    @Test
    public void test01() {
        int[][] matrix = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] ans = new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        sol.setZeroes(matrix);
        for (int i = 0; i < ans.length; i++)
            Assertions.assertTrue(Arrays.equals(ans[i], matrix[i]));
    }

    @Test
    public void test02() {
        int[][] matrix = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        int[][] ans = new int[][]{
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };
        sol.setZeroes(matrix);
        for (int i = 0; i < ans.length; i++)
            Assertions.assertTrue(Arrays.equals(ans[i], matrix[i]));
    }

    @Test
    public void test03() {
        int[][] matrix = new int[][]{
                {0, 1, 0, 1},
                {1, 1, 1, 1},
                {1, 3, 0, 5},
                {2, 2, 2, 2},
        };
        int[][] ans = new int[][]{
                {0, 0, 0, 0},
                {0, 1, 0, 1},
                {0, 0, 0, 0},
                {0, 2, 0, 2},
        };
        sol.setZeroes(matrix);
        for (int i = 0; i < ans.length; i++)
            Assertions.assertTrue(Arrays.equals(ans[i], matrix[i]));
    }
}
