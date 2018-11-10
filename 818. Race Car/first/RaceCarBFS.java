package first;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RaceCarBFS {
    // BFS solution with two pruning condition
    // because 2^(k - 1) < target < 2^k, for a specific k
    // and target can be reached either from 2^(k - 1) or 2^k
    // 1. the next position should be positive
    // 2. the next position will not exceed 2 * target
    public int racecar(int target) {
        int k = 0;
        while (1 << k <= target) k++;
        int upperBound = 1 << k;

        int level = 0;
        Set<String> visited = new HashSet<>();
        visited.add("0/1"); // position = 0, speed = 1
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 1});
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] curr = queue.poll();

                if (curr[0] == target) return level;
                // accelerate
                int[] next = new int[]{curr[0] + curr[1], curr[1] << 1};
                String nextKey = next[0] + "/" + next[1];
                if (visited.add(nextKey) && next[0] > 0 && next[1] <= upperBound)
                    queue.offer(next);

                // reverse
                next = new int[]{curr[0], curr[1] > 0 ? -1 : 1};
                nextKey = next[0] + "/" + next[1];
                if (visited.add(nextKey) && next[0] > 0 && next[1] <= upperBound)
                    queue.offer(next);
            }
            level++;
        }

        return -1;
    }
}
