package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumMatrixImmutableTest {

    @Test
    public void test01() {
        int[][] matrix = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrixImmutable numMatrix = new NumMatrixImmutable(matrix);
        Assertions.assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
        Assertions.assertEquals(11, numMatrix.sumRegion(1, 1, 2, 2));
        Assertions.assertEquals(12, numMatrix.sumRegion(1, 2, 2, 4));
    }
}
