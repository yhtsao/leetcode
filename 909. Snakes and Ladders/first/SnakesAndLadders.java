package first;

import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLadders {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] visited = new boolean[n * n + 1];
        visited[1] = true;
        int step = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            while (queueSize-- > 0) {
                int x = queue.remove();
                for (int i = x + 1; i <= x + 6; i++) {
                    int valOfNext = getBoardVal(board, i);
                    valOfNext = valOfNext < 0 ? i : valOfNext;
                    if (valOfNext == n * n) return step;
                    if (!visited[valOfNext]) {
                        visited[valOfNext] = true;
                        queue.add(valOfNext);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    private int getBoardVal(int[][] board, int x) {
        int n = board.length;
        int row = n - (x - 1) / n - 1;
        int col = (n - row) % 2 == 0 ? n - (x - 1) % n - 1 : (x - 1) % n;
        return board[row][col];
    }
}
