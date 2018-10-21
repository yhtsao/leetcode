package first;

public class GameOfLife {
    /**
     * 2 bits to record state transition
     * [next state, current state]
     * [0, 0] die to die
     * [0, 1] live to die
     * [1, 0] die to live
     * [1, 1] live to live
     *
     * @param board
     */
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int liveNeighbors = countLiveNeighbor(board, i, j);
                if (board[i][j] == 1 && (liveNeighbors == 2 || liveNeighbors == 3)) { // [0, 1]
                    // A live cell with 2 or 3 live neighbors
                    board[i][j] += 2; // [1, 1]
                } else if (board[i][j] == 0 && liveNeighbors == 3) {
                    // become live cell [1, 0]
                    board[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    private int countLiveNeighbor(int[][] board, int row, int col) {
        int liveNeighbor = 0;

        for (int i = Math.max(0, row - 1); i <= Math.min(board.length - 1, row + 1); i++) {
            for (int j = Math.max(0, col - 1); j <= Math.min(board[0].length - 1, col + 1); j++) {
                liveNeighbor += board[i][j] & 1;
            }
        }
        liveNeighbor -= board[row][col] & 1;
        return liveNeighbor;
    }
}
