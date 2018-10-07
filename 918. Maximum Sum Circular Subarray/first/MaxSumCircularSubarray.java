package first;

public class MaxSumCircularSubarray {
    public int maxSubarraySumCircular(int[] A) {
        int minSum = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE;
        int curMin = 0, curMax = 0;
        int totalSum = 0;
        for (int a : A) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(curMax, maxSum);

            curMin = Math.min(curMin + a, a);
            minSum = Math.min(curMin, minSum);

            totalSum += a;
        }

        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
}
