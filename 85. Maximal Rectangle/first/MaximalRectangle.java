package first;

import java.util.Arrays;
import java.util.Stack;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        return maximalRectangleSol2(matrix);
    }

    private int maximalRectangleSol1(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int[] height = new int[matrix[0].length];
        int maxRect = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                height[j] = matrix[i][j] == '0' ? 0 : (1 + height[j]);
            }
            maxRect = Math.max(maxRect, largestAreaRectangle(height));
        }
        return maxRect;
    }

    private int largestAreaRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= heights.length; i++) {
            int h = i == heights.length ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int preHeight = heights[stack.pop()];
                int preIndex = stack.isEmpty() ? -1 : stack.peek();
                int area = (i - preIndex - 1) * preHeight;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }

        return maxArea;
    }

    private int maximalRectangleSol2(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int maxRect = 0;
        int m = matrix.length, n = matrix[0].length;
        int[] left = new int[n], right = new int[n], height = new int[n];
        Arrays.fill(right, n);
        for (int i = 0; i < m; i++) {
            int currLeft = 0, currRight = n;

            // Calculate left boundary
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1')
                    left[j] = Math.max(left[j], currLeft);
                else {
                    left[j] = 0;
                    currLeft = j + 1;
                }
            }

            // Calculate right boundary
            for (int j = n - 1; j >= 0; j--) {
                if (matrix[i][j] == '1')
                    right[j] = Math.min(right[j], currRight);
                else {
                    right[j] = n;
                    currRight = j;
                }
            }

            // Calculate height
            for (int j = 0; j < n; j++)
                height[j] = matrix[i][j] == '0' ? 0 : height[j] + 1;

            // Calculate area
            for (int j = 0; j < n; j++)
                maxRect = Math.max(maxRect, (right[j] - left[j]) * height[j]);
        }
        return maxRect;
    }
}
