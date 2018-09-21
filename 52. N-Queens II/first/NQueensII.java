package first;

public class NQueensII {
    int numOfSol = 0;

    public int totalNQueens(int n) {
        backtracking(n, 0, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);
        return numOfSol;
    }

    private void backtracking(int n, int row, boolean[] usedCol, boolean[] leftDiag,
                              boolean[] rightDiag) {
        if (row == n) {
            numOfSol++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (usedCol[col] | leftDiag[row - col + n - 1] | rightDiag[row + col]) continue;
            usedCol[col] = true;
            leftDiag[row - col + n - 1] = true;
            rightDiag[row + col] = true;

            backtracking(n, row + 1, usedCol, leftDiag, rightDiag);

            usedCol[col] = false;
            leftDiag[row - col + n - 1] = false;
            rightDiag[row + col] = false;
        }
    }
}
