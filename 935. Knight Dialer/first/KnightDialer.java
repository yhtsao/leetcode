package first;

import java.util.HashMap;
import java.util.Map;

public class KnightDialer {
    final int mod = 1000000007;
    final int[][] phone = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {-1, 0, -1}
    };
    final int[][] dirs = new int[][]{
            {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2},
            {1, -2}, {2, -1}, {2, 1}, {1, 2}
    };

    public int knightDialer(int N) {
        int jumps = 0;
        Map<Integer, Integer>[] memo = new HashMap[10];
        for (int i = 0; i < 10; i++)
            memo[i] = new HashMap<>();

        for (int row = 0; row < phone.length; row++) {
            for (int col = 0; col < phone[0].length; col++) {
                if (phone[row][col] < 0) continue;
                jumps += jump(row, col, 1, N, memo);
                jumps %= mod;
            }
        }
        return jumps;
    }

    private int jump(int row, int col, int hops, int N, Map<Integer, Integer>[] memo) {
        if (row < 0 || row >= phone.length || col < 0 || col >= phone[0].length) return -1;
        if (phone[row][col] < 0) return -1;
        if (hops == N) return 1;
        if (memo[phone[row][col]].containsKey(hops)) return memo[phone[row][col]].get(hops);

        int jumps = 0;
        for (int[] dir : dirs) {
            int curr = jump(row + dir[0], col + dir[1], hops + 1, N, memo);
            if (curr > 0) {
                jumps += curr;
                jumps %= mod;
            }
        }
        memo[phone[row][col]].put(hops, jumps);
        return jumps;
    }
}
