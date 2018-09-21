package first;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] colCheck = new int[9][9];
        for (int i = 0; i < board.length; i++) {
            int[] rowCheck = new int[9];
            for (int j = 0; j < board[i].length; j++) {
                if (i % 3 == 0 && j % 3 == 0) {
                    int[] check = new int[9];
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            char c = board[k][l];
                            if (c == '.') continue;
                            check[c - '1']++;
                            if (check[c - '1'] > 1) return false;
                        }
                    }
                }
                if (board[i][j] == '.') continue;

                if (rowCheck[board[i][j] - '1']++ > 0) return false;
                if (colCheck[j][board[i][j] - '1']++ > 0) return false;
            }
        }
        return true;
    }
}
