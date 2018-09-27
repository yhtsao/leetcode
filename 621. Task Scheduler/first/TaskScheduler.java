package first;

import java.util.Arrays;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] taskArr = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            taskArr[tasks[i] - 'A']++;
        }
        Arrays.sort(taskArr);

        int count = 0;
        while (taskArr[25] == taskArr[25 - count]) {
            count++;
        }

        return Math.max(tasks.length, (taskArr[25] - 1) * (n + 1) + count);
    }
}
