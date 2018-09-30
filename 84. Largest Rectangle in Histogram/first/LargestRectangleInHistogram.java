package first;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) return 0;

        return largestRectangleAreaStack(heights);
    }

    private int largestRectangleAreaStack(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, heights[0]});
        int maxArea = heights[0];

        for (int i = 1; i < heights.length; i++) {
            int[] lastPop = new int[]{i, heights[i]};
            while (!stack.isEmpty() && heights[i] <= stack.peek()[1]) {
                maxArea = Math.max(maxArea, stack.peek()[1] * (i - stack.peek()[0]));
                lastPop = stack.pop();
            }
            stack.push(new int[]{lastPop[0], heights[i]});
        }

        while (!stack.isEmpty()) {
            int[] top = stack.pop();
            maxArea = Math.max(maxArea, top[1] * (heights.length - top[0]));
        }

        return maxArea;
    }
}
