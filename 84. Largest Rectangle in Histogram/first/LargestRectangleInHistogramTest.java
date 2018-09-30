package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestRectangleInHistogramTest {
    private LargestRectangleInHistogram solution = new LargestRectangleInHistogram();

    @Test
    public void test01() {
        int[] height = new int[]{2, 1, 5, 6, 2, 3};
        int ans = 10;
        int result = solution.largestRectangleArea(height);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        int[] height = new int[]{2};
        int ans = 2;
        int result = solution.largestRectangleArea(height);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        int[] height = new int[]{0};
        int ans = 0;
        int result = solution.largestRectangleArea(height);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test04() {
        int[] height = new int[]{2, 1, 5, 6, 2, 3, 2, 2};
        int ans = 12;
        int result = solution.largestRectangleArea(height);
        Assertions.assertEquals(ans, result);
    }
}
