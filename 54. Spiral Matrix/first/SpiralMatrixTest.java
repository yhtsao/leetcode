package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SpiralMatrixTest {
    private SpiralMatrix spiralMatrix = new SpiralMatrix();

    @Test
    public void test01() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> ans = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test02() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> ans = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test03() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        List<Integer> ans = Arrays.asList(1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8);
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test04() {
        int[][] matrix = new int[][]{
                {1, 2},
                {3, 4}
        };
        List<Integer> ans = Arrays.asList(1, 2, 4, 3);
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test05() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };
        List<Integer> ans = Arrays.asList(1, 2, 3, 4, 5, 10, 9, 8, 7, 6);
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test06() {
        int[][] matrix = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        };
        List<Integer> ans = Arrays.asList(1, 2, 4, 6, 8, 10, 9, 7, 5, 3);
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test07() {
        int[][] matrix = new int[][]{
                {1},
                {2},
                {3},
                {4}
        };
        List<Integer> ans = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        Assertions.assertTrue(ans.equals(result));
    }

    @Test
    public void test08() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4}
        };
        List<Integer> ans = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = spiralMatrix.spiralOrder(matrix);
        Assertions.assertTrue(ans.equals(result));
    }

}