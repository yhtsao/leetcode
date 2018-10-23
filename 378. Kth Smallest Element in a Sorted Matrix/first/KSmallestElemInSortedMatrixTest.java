package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KSmallestElemInSortedMatrixTest {
    KSmallestElemInSortedMatrix sol = new KSmallestElemInSortedMatrix();

    @Test
    public void test01() {
        int[][] matrix = new int[][]{
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        int ans = 13;
        Assertions.assertEquals(ans, sol.kthSmallest(matrix, k));
        k = 6;
        ans = 12;
        Assertions.assertEquals(ans, sol.kthSmallest(matrix, k));
    }

    @Test
    public void test02() {
        int[][] matrix = new int[][]{
                {1, 5, 10},
                {7, 9, 13},
                {8, 13, 15}
        };
        int k = 4;
        int ans = 8;
        Assertions.assertEquals(ans, sol.kthSmallest(matrix, k));
        k = 5;
        ans = 9;
        Assertions.assertEquals(ans, sol.kthSmallest(matrix, k));
        k = 6;
        ans = 10;
        Assertions.assertEquals(ans, sol.kthSmallest(matrix, k));
    }
}
