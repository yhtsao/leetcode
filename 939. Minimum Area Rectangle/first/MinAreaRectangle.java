package first;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinAreaRectangle {
    public int minAreaRectSol1(int[][] points) {
        Map<Integer, Set<Integer>> xmap = new HashMap<>(), ymap = new HashMap<>();
        int minArea = Integer.MAX_VALUE;
        for (int[] point : points) {
            // get points with same x-axis (second point)
            Set<Integer> ptWithSameX = xmap.get(point[0]);

            // get points with same y-axis (third point)
            Set<Integer> ptWithSameY = ymap.get(point[1]);

            // find fouth point to form a rectangle
            if (ptWithSameX != null && ptWithSameY != null) {
                for (int y : ptWithSameX) {
                    for (int x : ptWithSameY) {
                        if (xmap.containsKey(x) && xmap.get(x).contains(y)) {
                            minArea = Math.min(minArea, Math.abs(x - point[0]) * Math.abs(y - point[1]));
                        }
                    }
                }
            }

            // add current point to set
            xmap.putIfAbsent(point[0], new HashSet<>());
            ymap.putIfAbsent(point[1], new HashSet<>());
            xmap.get(point[0]).add(point[1]);
            ymap.get(point[1]).add(point[0]);
        }
        return minArea == Integer.MAX_VALUE ? 0 : minArea;
    }

    public int minAreaRectSol2(int[][] points) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();

        // Add all points into map
        for (int[] point : points) {
            map.putIfAbsent(point[0], new HashSet<>());
            map.get(point[0]).add(point[1]);
        }

        int minArea = Integer.MAX_VALUE;
        // Given two points, find other two points to form rectangle
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < i; j++) {
                int[] p1 = points[i], p2 = points[j];
                if (p1[0] == p2[0] || p1[1] == p2[1]) continue;
                if (map.containsKey(p1[0]) && map.get(p1[0]).contains(p2[1])
                        && map.containsKey(p2[0]) && map.get(p2[0]).contains(p1[1])) {
                    minArea = Math.min(minArea, Math.abs(p1[0] - p2[0]) * Math.abs(p1[1] - p2[1]));
                }
            }
        }
        return minArea == Integer.MAX_VALUE ? 0 : minArea;
    }
}
