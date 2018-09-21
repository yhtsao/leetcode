package first;

import java.util.Stack;

public class TrappingRainWater {
    public int trap(int[] height) {
        return trapTwoPointer(height);
        //return trapStack(height);
    }

    public int trapTwoPointer(int[] height) {
        int lo = 0, hi = height.length - 1;
        int trap = 0;
        int min;
        while (lo < hi) {
            if (height[lo] < height[hi]) {
                min = height[lo];
                while (lo < hi && height[lo] <= min)
                    trap += min - height[lo++];
            } else {
                min = height[hi];
                while (lo < hi && height[hi] <= min)
                    trap += min - height[hi--];
            }
        }
        return trap;
    }

    public int trapStack(int[] height) {
        int trap = 0;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < height.length) {
            if (stack.isEmpty() || height[i] < height[stack.peek()]) {
                stack.push(i++);
            } else {
                int hole = stack.peek();
                stack.pop();
                if (stack.isEmpty()) continue;

                int minHeight = Math.min(height[i], height[stack.peek()]);
                trap += (minHeight - height[hole]) * (i - stack.peek() - 1);
            }
        }
        return trap;
    }
}
