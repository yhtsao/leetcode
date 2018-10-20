package first;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectSquare {
    public int numSquares(int n) {
        return numSquaresMath(n);
    }

    private int numSquaresDP(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }

        }
        return dp[n];
    }

    private int numSquaresBFS(int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        queue.add(0);
        visited[0] = true;
        int depth = 0;
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            while (size-- > 0) {
                int currSum = queue.poll();
                for (int i = 1; i * i <= n; i++) {
                    int sum = currSum + i * i;
                    if (sum > n)
                        break;
                    if (sum == n)
                        return depth;
                    if (!visited[sum]) {
                        visited[sum] = true;
                        queue.offer(sum);
                    }
                }
            }
        }
        return depth;
    }

    /*
    Lagrange's four-square theorem
    Every natural number can be represented as the sum of four integer squares
    there are four possiple answer [1, 2, 3, 4]
    the number with form 4^k(8m+7) with integers k and m only represented as 4 integer squares
     */
    private int numSquaresMath(int n) {
        while ((n & 3) == 0) // n % 4 == 0
            n >>= 2;
        if ((n & 7) == 7) // n % 8 == 7
            return 4;
        for (int i = (int) Math.sqrt(n); i > 0; i--) {
            int tmp = (int) Math.sqrt(n - i * i);
            if (tmp * tmp + i * i == n)
                return tmp == 0 ? 1 : 2;
        }
        return 3;
    }
}
