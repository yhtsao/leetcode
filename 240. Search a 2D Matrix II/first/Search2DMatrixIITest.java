package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Search2DMatrixIITest {
    Search2DMatrixII sol = new Search2DMatrixII();

    @Test
    public void test01() {
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        Assertions.assertTrue(sol.searchMatrix(matrix, target));

        target = 20;
        Assertions.assertFalse(sol.searchMatrix(matrix, target));
    }

    @Test
    public void test02() {
        int[][] matrix = new int[][]{
                {1, 4}
        };
        int target = 4;
        Assertions.assertTrue(sol.searchMatrix(matrix, target));

        target = 20;
        Assertions.assertFalse(sol.searchMatrix(matrix, target));
    }
}
