package first;

import java.util.HashSet;
import java.util.Set;

public class MagicSquaresInGrid {
    public int numMagicSquaresInside(int[][] grid) {
        if (grid.length < 3) return 0;
        if (grid[0].length < 3) return 0;

        int result = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[i].length - 2; j++) {
                if (grid[i + 1][j + 1] != 5) continue;

                Set<Integer> set = new HashSet<>();
                for (int a = i; a < i + 3; a++) {
                    for (int b = j; b < j + 3; b++) {
                        if (grid[a][b] > 0 && grid[a][b] < 10)
                            set.add(grid[a][b]);
                    }
                }

                if (set.size() != 9) continue;

                int sum = 15;
                if (sum != grid[i][j] + grid[i][j + 1] + grid[i][j + 2])
                    continue;
                if (sum != grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2])
                    continue;
                if (sum != grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2])
                    continue;
                if (sum != grid[i][j] + grid[i + 1][j] + grid[i + 2][j])
                    continue;
                if (sum != grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1])
                    continue;
                if (sum != grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2])
                    continue;

                if (sum != grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2])
                    continue;
                if (sum != grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j])
                    continue;

                result++;

            }
        }
        return result;
    }
}
