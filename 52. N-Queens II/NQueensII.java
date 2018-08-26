public class NQueensII {
    public int totalNQueens(int n) {
        return backtracking(0, n, 0, new int[n]);
    }

    private int backtracking(Integer numOfSol, int n, int row, int[] used) {
        if (row == n) {
            numOfSol++;
            return numOfSol;
        }

        for (int col = 0; col < n; col++) {
            if (!isValid(used, row, col)) continue;
            used[row] = col;
            numOfSol = backtracking(numOfSol, n, row + 1, used);
        }
        return numOfSol;
    }

    private boolean isValid(int[] used, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (used[i] == col) return false;
        }
        for (int i = 1; i <= row; i++) {
            if (used[row - i] == col - i) return false;
            if (used[row - i] == col + i) return false;
        }
        return true;
    }
}
