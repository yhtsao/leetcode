package first;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
    final int[][] dirs = new int[][]{
            {-1, 0}, {0, -1}, {0, 1}, {1, 0}
    };

    public int shortestBridge(int[][] A) {
        Queue<int[]> queue = new LinkedList<>();
        // Find first island by DFS
        boolean found = false;
        for (int i = 0; i < A.length && !found; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 1) {
                    dfs(A, i, j, queue);
                    found = true;
                    break;
                }
            }
        }

        // Run BFS to find shorest path
        int cnt = 0;
        int[] cur;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                cur = queue.poll();
                for (int[] dir : dirs) {
                    int i = cur[0] + dir[0], j = cur[1] + dir[1];
                    if (i < 0 || i >= A.length || j < 0 || j >= A[0].length || A[i][j] == 2) continue;
                    if (A[i][j] == 1) return cnt;
                    A[i][j] = 2;
                    queue.offer(new int[]{i, j});
                }
            }
            cnt++;
        }
        return -1;
    }

    // mark first island by changing value to 2
    private void dfs(int[][] A, int row, int col, Queue<int[]> queue) {
        if (row < 0 || row >= A.length || col < 0 || col >= A[0].length || A[row][col] != 1) return;
        A[row][col] = 2; // to indicate this squres is first island
        queue.offer(new int[]{row, col});
        for (int[] dir : dirs) {
            dfs(A, row + dir[0], col + dir[1], queue);
        }
    }
}
