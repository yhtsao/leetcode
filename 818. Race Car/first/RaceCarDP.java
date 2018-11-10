package first;

public class RaceCarDP {
    // DP solution
    // for any given target, we can find n so that pow(2, n - 1) < target < pow(2, n)
    // so we have two way to reach target
    // 1. get to pow(2, n) then go back to target
    // 2. get to pow(2, n-1) then go back m steps and go forward to target
    //
    // Example: target = 5
    // 1. go to 7 (AAA), and reverse (R), and go back 2 step (AARA)
    //      give AAARAARA to reach 5
    // 2. go to 3 (AA), now we have m steps back, and go forward target - pow(2, n-1) + pow(2, m) steps
    //      m = 0, 3 (AA) + go back (R) + back 0 step () + go forward (R) + forward 2 steps (AARA)
    //      m = 1, 3 (AA) + go back (R) + back 1 step (A) + go forward (R) + forward 3 steps (AA)
    public int racecar(int target) {
        return racecar(target, new int[10001]);
    }

    private int racecar(int target, int[] dp) {
        if (dp[target] > 0) return dp[target];
        int n = (int) (Math.log(target) / Math.log(2)) + 1;
        if (target == (1 << n) - 1)
            dp[target] = n;
        else {
            dp[target] = n + 1 + racecar((1 << n) - 1 - target, dp);
            for (int m = 0; m < n - 1; m++)
                dp[target] = Math.min(dp[target], (n - 1) + 1 + m + 1 + racecar(target - (1 << (n - 1)) + (1 << m), dp));
        }
        return dp[target];

    }
}
