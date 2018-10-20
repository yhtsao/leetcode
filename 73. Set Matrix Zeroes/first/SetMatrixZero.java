package first;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {
    // O(1) space
    public void setZeroes(int[][] matrix) {
        boolean col0isZero = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j == 0) col0isZero = true;
                    else matrix[0][j] = 0;
                }
            }
        }

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j > 0; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if (col0isZero) matrix[i][0] = 0;
        }
    }

    // O(n) space
    private void setZeroesNspace(int[][] matrix) {
        Set<Integer> rowZero = new HashSet<>(), colZero = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowZero.add(i);
                    colZero.add(j);
                }
            }
        }

        for (Integer row : rowZero)
            for (int i = 0; i < matrix[0].length; i++)
                matrix[row][i] = 0;

        for (Integer col : colZero)
            for (int i = 0; i < matrix.length; i++)
                matrix[i][col] = 0;
    }
}
