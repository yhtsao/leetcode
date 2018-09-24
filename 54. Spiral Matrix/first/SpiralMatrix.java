package first;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;

        int maxRow = matrix.length - 1;
        int maxCol = matrix[0].length - 1;

        recur(matrix, 0, 0, maxRow, maxCol, list);
        return list;
    }

    private void recur(int[][] matrix, int row, int col, int maxRow, int maxCol, List<Integer> list) {
        if (row > maxRow && col > maxCol)
            return;

        for (int i = col; i <= maxCol && row <= maxRow; i++) {
            list.add(matrix[row][i]);
        }

        for (int i = row + 1; i <= maxRow && col <= maxCol; i++) {
            list.add(matrix[i][maxCol]);
        }

        for (int i = maxCol - 1; i >= col && row < maxRow; i--) {
            list.add(matrix[maxRow][i]);
        }

        for (int i = maxRow - 1; i > row && col < maxCol; i--) {
            list.add(matrix[i][col]);
        }

        recur(matrix, row + 1, col + 1, maxRow - 1, maxCol - 1, list);
    }
}
