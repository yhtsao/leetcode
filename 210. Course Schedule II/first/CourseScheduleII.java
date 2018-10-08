package first;

import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        return findOrderBFS(numCourses, prerequisites);
    }

    public int[] findOrderBFS(int numCourses, int[][] prerequisites) {
        boolean[][] edges = new boolean[numCourses][numCourses];
        int[] indegrees = new int[numCourses];
        for (int[] edge : prerequisites) {
            edges[edge[1]][edge[0]] = true; // edge[1] -> edge[0]
            indegrees[edge[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++)
            if (indegrees[i] == 0) queue.offer(i);

        int[] result = new int[numCourses];
        int index = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            result[index++] = course;
            for (int i = 0; i < numCourses; i++)
                if (edges[course][i])
                    if (--indegrees[i] == 0) queue.offer(i);
        }
        return index == numCourses ? result : new int[]{};
    }
}
