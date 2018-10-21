package first;

public class Search2DMatrixII {

    public boolean searchMatrix(int[][] matrix, int target) {
        // start from top-right cell
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (target < matrix[row][col])
                col--;
            else if (target > matrix[row][col])
                row++;
        }
        return false;
    }
}
