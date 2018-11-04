package first;

public class KnightDialerV2 {
    private int mod = 1000000007;

    public int knightDialer(int N) {
        int[][] moves = new int[][]{
                {4, 6}, {6, 8}, {7, 9}, {4, 8}, {0, 3, 9}, {},
                {0, 1, 7}, {2, 6}, {1, 3}, {2, 4}
        };
        Integer[][] memo = new Integer[10][N + 1];
        int jumps = 0;
        for (int i = 0; i <= 9; i++) {
            jumps += jump(N - 1, i, moves, memo);
            jumps %= mod;
        }
        return jumps;
    }

    private int jump(int N, int cur, int[][] moves, Integer[][] memo) {
        if (N == 0) return 1;
        if (memo[cur][N] != null) return memo[cur][N];

        int jumps = 0;
        for (int next : moves[cur]) {
            jumps += jump(N - 1, next, moves, memo);
            jumps %= mod;
        }
        memo[cur][N] = jumps;
        return memo[cur][N];
    }
}
