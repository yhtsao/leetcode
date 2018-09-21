package first;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        backtracking(results, n, 0, new int[n]);
        return results;
    }

    private void backtracking(List<List<String>> results, int n, int row, int[] used) {
        if (row == n) {
            List<String> list = genBoard(used); // Ex: ..Q.
            results.add(list);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (!isValid(used, row, col)) continue;
            used[row] = col;
            backtracking(results, n, row + 1, used);
        }
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

    private List<String> genBoard(int[] used) {
        char[] row = new char[used.length];
        for (int i = 0; i < used.length; i++)
            row[i] = '.';

        List<String> list = new ArrayList<>();
        for (int i = 0; i < used.length; i++) {
            row[used[i]] = 'Q';
            list.add(new String(row));
            row[used[i]] = '.';
        }
        return list;
    }
}
