package first.dp;

public class NumMatrix {
    int[][] matrix;
    int[][] rowSum;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.rowSum = new int[matrix.length][matrix[0].length + 1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                rowSum[i][j + 1] = rowSum[i][j] + matrix[i][j];
        }
    }

    public void update(int row, int col, int val) {
        int diff = val - matrix[row][col];
        matrix[row][col] = val;
        for (int i = col + 1; i <= matrix[0].length; i++) {
            rowSum[row][i] += diff;
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;

        for (int i = row1; i <= row2; i++) {
            sum += rowSum[i][col2 + 1] - rowSum[i][col1];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * obj.update(row,col,val);
 * int param_2 = obj.sumRegion(row1,col1,row2,col2);
 */
