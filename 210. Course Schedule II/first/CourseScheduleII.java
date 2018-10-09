package first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {
    class Vertex {
        boolean isVisited;
        boolean isPoped;
        int course;
        List<Vertex> childs;

        Vertex(int course) {
            this.isVisited = false;
            this.isPoped = false;
            this.course = course;
            this.childs = new ArrayList<>();
        }
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        return findOrderDFS(numCourses, prerequisites);
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

    public int[] findOrderDFS(int numCourses, int[][] prerequisites) {
        // build graph
        Vertex[] graph = new Vertex[numCourses];
        for (int i = 0; i < numCourses; i++)
            graph[i] = new Vertex(i);
        for (int[] pre : prerequisites) {
            graph[pre[0]].childs.add(graph[pre[1]]);
        }

        // Run DFS and check if there have cycle
        List<Integer> resultList = new ArrayList<>();
        for (Vertex v : graph) {
            if (isCyclic(v, resultList))
                return new int[0];
        }
        return resultList.stream().mapToInt(i -> i).toArray();
    }

    private boolean isCyclic(Vertex v, List<Integer> result) {
        if (v.isPoped) return false;
        if (v.isVisited) return true;
        v.isVisited = true;
        for (Vertex child : v.childs) {
            if (isCyclic(child, result))
                return true;
        }
        v.isPoped = true;
        result.add(v.course);
        return false;
    }
}
