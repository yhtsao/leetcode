package first;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        return canFinishBFS(numCourses, prerequisites);
    }

    public boolean canFinishBFS(int numCourses, int[][] prerequisites) {
        boolean[][] edges = new boolean[numCourses][numCourses];
        int[] indegrees = new int[numCourses];
        for (int[] edge : prerequisites) {
            edges[edge[0]][edge[1]] = true; // edge[0] -> edge[1]
            indegrees[edge[1]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++)
            if (indegrees[i] == 0) queue.offer(i);

        int count = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for (int i = 0; i < numCourses; i++)
                if (edges[course][i])
                    if (--indegrees[i] == 0) queue.offer(i);
        }
        return count == numCourses;
    }
}
