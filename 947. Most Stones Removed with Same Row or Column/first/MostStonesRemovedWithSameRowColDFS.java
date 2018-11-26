package first;

import java.util.HashSet;
import java.util.Set;

public class MostStonesRemovedWithSameRowColDFS {
    public int removeStones(int[][] stones) {
        Set<Integer> visited = new HashSet<>();
        int cnt = 0;
        for (int[] stone : stones) {
            int pos = stone[0] * 10000 + stone[1];
            if (visited.contains(pos)) continue;
            visited.add(pos);
            cnt++;
            dfs(stones, stone[0], stone[1], visited);
        }
        return stones.length - cnt;
    }

    private void dfs(int[][] stones, int row, int col, Set<Integer> visited) {
        for (int[] stone : stones) {
            int pos = stone[0] * 10000 + stone[1];
            if (visited.contains(pos) || (stone[0] != row && stone[1] != col)) continue;
            visited.add(pos);
            dfs(stones, stone[0], stone[1], visited);
        }
    }
}
