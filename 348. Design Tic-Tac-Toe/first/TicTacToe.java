package first;

public class TicTacToe {
    private int[][] board;
    private int n;

    /**
     * Initialize your data structure here.
     */
    public TicTacToe(int n) {
        this.board = new int[n][n];
        this.n = n;
    }

    /**
     * Player {player} makes a move at ({row}, {col}).
     *
     * @param row    The row of the board.
     * @param col    The column of the board.
     * @param player The player, can be either 1 or 2.
     * @return The current winning condition, can be either:
     * 0: No one wins.
     * 1: Player 1 wins.
     * 2: Player 2 wins.
     */
    public int move(int row, int col, int player) {
        if (board[row][col] != 0)
            return 0;
        board[row][col] = player;

        boolean isWin = true;
        // check row
        for (int i = 0; i < n; i++)
            isWin = isWin & board[row][i] == player;
        if (isWin) return player;

        // check col
        isWin = true;
        for (int i = 0; i < n; i++)
            isWin = isWin & board[i][col] == player;
        if (isWin) return player;

        // check diagonal
        isWin = true;
        for (int i = 0; i < n; i++)
            isWin = isWin & board[i][i] == player;
        if (isWin) return player;

        // check anti-diagonal
        isWin = true;
        for (int i = 0; i < n; i++)
            isWin = isWin & board[i][n - i - 1] == player;
        if (isWin) return player;

        return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
