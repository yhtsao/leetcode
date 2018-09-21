package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RotateImageTest {
    @Test
    public void test01() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(matrix);
        int[][] rotatedMatrix = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        for (int i = 0; i < matrix.length; i++)
            Assertions.assertTrue(Arrays.equals(rotatedMatrix[i], matrix[i]));
    }

    @Test
    public void test02() {
        int[][] matrix = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(matrix);
        int[][] rotatedMatrix = new int[][]{
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };
        for (int i = 0; i < matrix.length; i++)
            Assertions.assertTrue(Arrays.equals(rotatedMatrix[i], matrix[i]));
    }
}
