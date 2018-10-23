package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BestMeetingPoint {
    /**
     * 1D distance, 4 people {A, B, C, D}, meeting point P
     * ___C___A____P_____B____D____
     * min distance = (D-P) +(P-C) + (B-P) + (P-A) = (D-C) + (B-A)
     */
    public int minTotalDistance(int[][] grid) {
        List<Integer> row = new ArrayList<>(), col = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        // Because row is add by ascending order, sorting 'col' is enough
        Collections.sort(col);
        int lo = 0, hi = row.size() - 1;
        int ret = 0;
        while (lo < hi)
            ret += row.get(hi) - row.get(lo) + col.get(hi--) - col.get(lo++);
        return ret;
    }
}
