package first;

public class MineSweeper {
    final int[][] dirs = new int[][]{
            new int[]{-1, -1}, new int[]{-1, 0}, new int[]{-1, 1},
            new int[]{0, -1}, new int[]{0, 1},
            new int[]{1, -1}, new int[]{1, 0}, new int[]{1, 1},
    };

    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M')
            board[click[0]][click[1]] = 'X';
        else
            dfs(board, click[0], click[1]);

        return board;
    }

    private void dfs(char[][] board, int row, int col) {
        if (board[row][col] == 'B') return;

        int mines = 0;
        for (int[] dir : dirs) {
            if (row + dir[0] < 0 || row + dir[0] >= board.length
                    || col + dir[1] < 0 || col + dir[1] >= board[0].length) {
                continue;
            }
            if (board[row + dir[0]][col + dir[1]] == 'M')
                mines++;
        }
        if (mines != 0) {
            board[row][col] = Character.forDigit(mines, 10);
            return;
        }
        board[row][col] = 'B';
        for (int[] dir : dirs) {
            if (row + dir[0] < 0 || row + dir[0] >= board.length
                    || col + dir[1] < 0 || col + dir[1] >= board[0].length) {
                continue;
            }
            dfs(board, row + dir[0], col + dir[1]);
        }
    }
}
