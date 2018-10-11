package first.bit;

public class NumMatrix {
    int[][] matrix;
    int[][] bit; // binary index tree

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.bit = new int[matrix.length + 1][matrix[0].length + 1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                updateBIT(i, j, matrix[i][j]);
        }
    }

    private void updateBIT(int row, int col, int val) {
        row++;
        col++;
        for (int i = row; i < bit.length; i += getLowBit(i)) {
            for (int j = col; j < bit[0].length; j += getLowBit(j))
                bit[i][j] += val;
        }

    }

    private int sumBIT(int row, int col) {
        int sum = 0;
        row++;
        col++;
        for (int i = row; i > 0; i -= getLowBit(i)) {
            for (int j = col; j > 0; j -= getLowBit(j))
                sum += bit[i][j];
        }
        return sum;
    }

    public void update(int row, int col, int val) {
        int diff = val - matrix[row][col];
        matrix[row][col] = val;
        updateBIT(row, col, diff);
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumBIT(row2, col2) - sumBIT(row1 - 1, col2)
                - sumBIT(row2, col1 - 1) + sumBIT(row1 - 1, col1 - 1);
    }

    private int getLowBit(int i) {
        return i & (-i);
    }
}
