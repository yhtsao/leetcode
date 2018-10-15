package first;

import common.Point;

import java.util.HashMap;
import java.util.Map;

public class MaxPointOnLine {
    public int maxPoints(Point[] points) {
        if (points.length < 2) return points.length;
        int max = 2, currentMax, samePoints;
        String slope;
        Map<String, Integer> map;
        for (int i = 0; i < points.length; i++) {
            currentMax = 0;
            samePoints = 1;
            map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].x == points[j].x && points[i].y == points[j].y)
                    samePoints++;
                else {
                    slope = genSlopeString(points[i], points[j]);
                    map.compute(slope, (key, val) -> {
                        if (val == null)
                            val = 0;
                        val++;
                        return val;
                    });
                    currentMax = Math.max(currentMax, map.get(slope));
                }
            }
            currentMax += samePoints;
            max = Math.max(currentMax, max);
        }
        return max;
    }

    private String genSlopeString(Point p1, Point p2) {
        int xdiff = p1.x - p2.x;
        int ydiff = p1.y - p2.y;
        int gcd = gcd(xdiff, ydiff);
        xdiff /= gcd;
        ydiff /= gcd;
        return new StringBuilder().append(xdiff).append(ydiff).toString();
    }

    public int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
