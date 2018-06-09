import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class FlipImageTest {
    @Test
    public void test1() {
        int[][] A = new int[][]{
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] ans = new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        FlipImage flipImage = new FlipImage();
        A = flipImage.flipAndInvertImage(A);

        for (int i = 0; i < A.length; i++)
            Assertions.assertTrue(Arrays.equals(A[i], ans[i]));
    }

    @Test
    public void test2() {
        int[][] A = new int[][]{
                {1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}
        };
        int[][] ans = new int[][]{
                {1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}
        };
        FlipImage flipImage = new FlipImage();
        A = flipImage.flipAndInvertImage(A);

        for (int i = 0; i < A.length; i++)
            Assertions.assertTrue(Arrays.equals(A[i], ans[i]));

    }

    @Test
    public void test3() {
        int[][] A = new int[][]{
                {0}
        };
        int[][] ans = new int[][]{
                {1}
        };
        FlipImage flipImage = new FlipImage();
        A = flipImage.flipAndInvertImage(A);

        for (int i = 0; i < A.length; i++)
            Assertions.assertTrue(Arrays.equals(A[i], ans[i]));

    }
}