package first;

public class New21Game {

    // dp[i] is probability to get i points
    // dp[i] = (dp[i - 1] + dp[i - 2] + ... + dp[i - W]) / W
    // from i - 1 to i - W, we can choose 1 to W to reach i
    // each of situations have 1/W probability
    //
    // sum all probabilities until k - 1 (dp[k-1])
    // dp[k] = (dp[k - 1] + dp[k - 2] + ... + dp[k - W]) / W
    public double new21Game(int N, int K, int W) {
        if (K == 0 || K - 1 + W <= N) return 1;

        double[] dp = new double[N + 1];
        double sum = 1;
        dp[0] = 1;
        double ret = 0;
        for (int i = 1; i <= N; i++) {
            dp[i] = sum / W;
            if (i < K) sum += dp[i];
            else ret += dp[i];
            if (i >= W) sum -= dp[i - W];
        }

        return ret;
    }
}
