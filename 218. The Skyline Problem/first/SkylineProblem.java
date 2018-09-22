package first;

import java.util.*;

public class SkylineProblem {
    private class Point implements Comparable {
        int x;
        int y;
        boolean isStart;

        Point(int x, int y, boolean isStart) {
            this.x = x;
            this.y = y;
            this.isStart = isStart;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder()
                    .append(x).append(", ")
                    .append(y).append(", ");

            if (isStart) sb.append("start");
            else sb.append("end");
            return sb.toString();
        }

        @Override
        public int compareTo(Object o) {
            Point p = (Point) o;
            if (this.x != p.x)
                return this.x - p.x;
            return (this.isStart ? -this.y : this.y) - (p.isStart ? -p.y : p.y);
        }
    }

    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> keyPoints = new ArrayList<>();

        List<Point> points = new ArrayList<>();
        for (int i = 0; i < buildings.length; i++) {
            points.add(new Point(buildings[i][0], buildings[i][2], true));
            points.add(new Point(buildings[i][1], buildings[i][2], false));
        }
        Collections.sort(points);

        TreeMap<Integer, Integer> queue = new TreeMap<>();
        queue.put(0, 1);
        for (Point point : points) {
            int prevHeight = queue.lastKey();
            if (point.isStart) {
                queue.compute(point.y, (key, value) -> {
                    if (value != null) return value + 1;
                    return 1;
                });
            } else {
                queue.compute(point.y, (key, value) -> {
                    if (value == 1) return null;
                    return value - 1;
                });
            }

            if (prevHeight != queue.lastKey()) {
                keyPoints.add(new int[]{point.x, queue.lastKey()});
            }
        }

        return keyPoints;
    }
}
