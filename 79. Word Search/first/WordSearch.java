package first;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if (word == null || word.isEmpty()) return true;
        if (board.length == 0 || board[0].length == 0) return false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (backtracking(board, i, j, word, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean backtracking(char[][] board, int row, int col, String word, int wordIndex) {
        if (wordIndex == word.length()) return true;
        if (row < 0 || col < 0 || row == board.length || col == board[0].length) return false;
        if (board[row][col] != word.charAt(wordIndex)) return false;

        char c = board[row][col];
        board[row][col] = ' ';
        if (backtracking(board, row - 1, col, word, wordIndex + 1)) return true;
        if (backtracking(board, row + 1, col, word, wordIndex + 1)) return true;
        if (backtracking(board, row, col + 1, word, wordIndex + 1)) return true;
        if (backtracking(board, row, col - 1, word, wordIndex + 1)) return true;
        board[row][col] = c;
        return false;
    }
}
