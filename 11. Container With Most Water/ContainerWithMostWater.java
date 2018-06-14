public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int lo = 0, hi = height.length - 1;
        while (lo < hi) {
            int minHeight;
            int base = hi - lo;
            if (height[lo] < height[hi]) {
                minHeight = height[lo];
                lo++;
            } else {
                minHeight = height[hi];
                hi--;
            }
            if (minHeight * base > maxArea)
                maxArea = minHeight * base;
        }
        return maxArea;
    }

    public int maxAreaBruteForce(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);
                if (minHeight * (j - i) > maxArea)
                    maxArea = minHeight * (j - i);

            }
        }
        return maxArea;
    }
}
