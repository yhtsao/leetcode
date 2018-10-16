package first;

public class SurroundedRegions {
    public void solve(char[][] board) {
        if (board.length == 0) return;
        boolean[][] notSurrounded = new boolean[board.length][board[0].length];

        // find all not surrounded squre
        for (int i = 0; i < board[0].length; i++) {
            dfs(board, 0, i, notSurrounded);
            dfs(board, board.length - 1, i, notSurrounded);
        }
        for (int i = 1; i < board.length - 1; i++) {
            dfs(board, i, 0, notSurrounded);
            dfs(board, i, board[0].length - 1, notSurrounded);
        }

        // mark surrounded squre
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[0].length; j++)
                if (!notSurrounded[i][j]) board[i][j] = 'X';
        }
    }

    private void dfs(char[][] board, int row, int col, boolean[][] notSurrounded) {
        if (notSurrounded[row][col] || board[row][col] == 'X') return;

        notSurrounded[row][col] = true;
        if (row - 1 > 0)
            dfs(board, row - 1, col, notSurrounded);
        if (row + 1 < board.length)
            dfs(board, row + 1, col, notSurrounded);
        if (col - 1 > 0)
            dfs(board, row, col - 1, notSurrounded);
        if (col + 1 < board[0].length)
            dfs(board, row, col + 1, notSurrounded);

    }
}
