package first;

public class TicTacToe {
    private int n;
    private int[] rowMove, colMove;
    private int diagonal, antiDiagonal;


    /**
     * Initialize your data structure here.
     */
    public TicTacToe(int n) {
        this.rowMove = new int[n];
        this.colMove = new int[n];
        this.diagonal = 0;
        this.antiDiagonal = 0;
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
        boolean isWin = false;

        if (player == 1) {
            isWin = isWin | (++rowMove[row] == n);
            isWin = isWin | (++colMove[col] == n);

            if (row == col)
                isWin = isWin | (++diagonal == n);
            if (row == n - col - 1)
                isWin = isWin | (++antiDiagonal == n);
        } else {
            isWin = isWin | (--rowMove[row] == -n);
            isWin = isWin | (--colMove[col] == -n);

            if (row == col)
                isWin = isWin | (--diagonal == -n);
            if (row == n - col - 1)
                isWin = isWin | (--antiDiagonal == -n);
        }

        return isWin ? player : 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
