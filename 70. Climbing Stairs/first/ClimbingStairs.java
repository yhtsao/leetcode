package first;

public class ClimbingStairs {

    // f(n) = f(n - 1) + f(n - 2)
    public int climbStairs(int n) {
        int f0 = 1, f1 = 1;
        int tmp;
        for (int i = 2; i <= n; i++) {
            tmp = f0 + f1;
            f0 = f1;
            f1 = tmp;
        }
        return f1;
    }
}
