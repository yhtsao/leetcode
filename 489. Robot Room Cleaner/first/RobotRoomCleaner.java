package first;

import java.util.HashSet;
import java.util.Set;

public class RobotRoomCleaner {
    final int[][] dir = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public void cleanRoom(Robot robot) {
        dfs(robot, 0, 0, 0, new HashSet<String>());
    }

    private void dfs(Robot robot, int dirIndex, int row, int col, Set<String> visited) {
        String position = row + "/" + col;
        if (visited.contains(position)) return;
        visited.add(position);
        robot.clean();

        // Try four directions
        for (int i = 0; i < 4; i++) {
            int currDir = (dirIndex + i) % 4;
            if (robot.move()) {
                dfs(robot, currDir, row + dir[currDir][0], col + dir[currDir][1], visited);
                goBack(robot);
            }
            robot.turnRight();
        }
    }

    private void goBack(Robot robot) {
        robot.turnRight();
        robot.turnRight();
        robot.move();
        robot.turnLeft();
        robot.turnLeft();
    }
}
