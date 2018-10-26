package first;

import java.util.Stack;

public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        return maximalSquareDP(matrix);
    }

    public int maximalSquareDP(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
        int maxWidth = 0;

        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                dp[i][j] = matrix[i - 1][j - 1] == '0' ? 0
                        : Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                maxWidth = Math.max(maxWidth, dp[i][j]);
            }
        }
        return maxWidth * maxWidth;
    }

    public int maximalSquareNaive(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int[] heights = new int[matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                heights[j] = matrix[i][j] == '0' ? 0 : heights[j] + 1;

            max = Math.max(max, largestSquareArea(heights));
        }
        return max;
    }

    private int largestSquareArea(int[] height) {
        Stack<Integer> indexStack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= height.length; i++) {
            int h = i == height.length ? 0 : height[i]; // index stack: [0, 2], [1, 3], [2, 4],
            while (!indexStack.isEmpty() && h < height[indexStack.peek()]) {
                int preHeight = height[indexStack.pop()];
                int preIndex = indexStack.isEmpty() ? -1 : indexStack.peek();
                int width = Math.min(i - preIndex - 1, preHeight);
                maxArea = Math.max(maxArea, width * width);
            }
            indexStack.push(i);
        }
        return maxArea;
    }
}
