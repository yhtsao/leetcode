package first;

public class NumOfMusicPlaylists {
    final double mod = 1000000007;

    /*
    dp[N][L]
    1. first L-1 elements contains N-1 elements, and last position can be N possible elements
        dp[N-1][L-1] * N
        Ex: N = 4 (ABCD), L = 4
        first L - 1,    Last
            ABC         D
            BCD         A
            CDA         B
            DAB         C
    2. first L-1 elements contains N elements, and last position cannot as same as last K elements
        dp[N][L-1] * (N - K)
     */
    public int numMusicPlaylists(int N, int L, int K) {
        double[][] dp = new double[N + 1][L + 1];
        dp[0][0] = 1;
        for (int n = 1; n <= N; n++) {
            for (int l = n; l <= L; l++) {
                dp[n][l] = (dp[n - 1][l - 1] * n) + (dp[n][l - 1] * Math.max(0, n - K));
                dp[n][l] %= mod;
            }
        }
        return (int) dp[N][L];
    }
}
