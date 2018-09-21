package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagicSquaresInGridTest {
    @Test
    public void test() {
        int[][] nums = new int[][]{
                {4, 3, 8, 4},
                {9, 5, 1, 9},
                {2, 7, 6, 2}};

        MagicSquaresInGrid magicSquaresInGrid = new MagicSquaresInGrid();
        int result = magicSquaresInGrid.numMagicSquaresInside(nums);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void test02() {
        int[][] nums = new int[][]{
                {5, 5, 5},
                {5, 5, 5},
                {5, 5, 5}};

        MagicSquaresInGrid magicSquaresInGrid = new MagicSquaresInGrid();
        int result = magicSquaresInGrid.numMagicSquaresInside(nums);
        Assertions.assertEquals(0, result);
    }
}
