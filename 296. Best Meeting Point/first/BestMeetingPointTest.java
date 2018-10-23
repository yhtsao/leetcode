package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestMeetingPointTest {
    BestMeetingPoint sol = new BestMeetingPoint();

    @Test
    public void test01() {
        int[][] grid = new int[][]{
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0}
        };
        int ans = 6;
        int ret = sol.minTotalDistance(grid);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int[][] grid = new int[][]{
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0}
        };
        int ans = 7;
        int ret = sol.minTotalDistance(grid);
        Assertions.assertEquals(ans, ret);
    }
}
