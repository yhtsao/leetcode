package first;

import common.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxPointOnLineTest {
    private MaxPointOnLine sol = new MaxPointOnLine();

    @Test
    public void test01() {
        Point[] points = new Point[]{
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 3)
        };
        int ans = 3;
        int res = sol.maxPoints(points);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test02() {
        Point[] points = new Point[]{
                new Point(1, 1),
                new Point(3, 2),
                new Point(5, 3),
                new Point(4, 1),
                new Point(2, 3),
                new Point(1, 4),
        };
        int ans = 4;
        int res = sol.maxPoints(points);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test03() {
        Point[] points = new Point[]{
                new Point(1, 1),
                new Point(2, 2),
                new Point(2, 4),
                new Point(3, 3),
                new Point(4, 2),
                new Point(5, 1)
        };
        int ans = 4;
        int res = sol.maxPoints(points);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test04() {
        Point[] points = new Point[]{
                new Point(0, 0),
                new Point(0, 0)
        };
        int ans = 2;
        int res = sol.maxPoints(points);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test05() {
        Point[] points = new Point[]{
                new Point(2, 3),
                new Point(-5, 3),
                new Point(3, 3)
        };
        int ans = 3;
        int res = sol.maxPoints(points);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test06() {
        Point[] points = new Point[]{
                new Point(4, 0),
                new Point(4, -1),
                new Point(4, 5)
        };
        int ans = 3;
        int res = sol.maxPoints(points);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test07() {
        Point[] points = new Point[]{
                new Point(1, 1),
                new Point(1, 1),
                new Point(2, 3)
        };
        int ans = 3;
        int res = sol.maxPoints(points);
        Assertions.assertEquals(ans, res);
    }

    @Test
    public void test08() {
        Point[] points = new Point[]{
                new Point(0, 0),
                new Point(94911151, 94911150),
                new Point(94911152, 94911151)
        };
        int ans = 2;
        int res = sol.maxPoints(points);
        Assertions.assertEquals(ans, res);
    }

}
