package first;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // for each element in matrix, compare it to top-left element
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++)
                if (matrix[i][j] != matrix[i - 1][j - 1]) return false;
        }
        return true;
    }
}
