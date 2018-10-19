package first;

import org.junit.jupiter.api.Assertions;

import java.util.*;

public class FindCelebrity {
    int[][] relation;

    public FindCelebrity(int[][] relation) {
        this.relation = relation;
    }

    private boolean knows(int a, int b) {
        return relation[a][b] == 1;
    }

    /**
     * @param n a party with n people
     * @return the celebrity's label or -1
     */
    public int findCelebrity(int n) {
        int ret = 0;
        for (int i = 1; i < n; i++) {
            if (knows(ret, i)) ret = i;
        }

        for (int i = 0; i < n; i++) {
            if (ret != i && (knows(ret, i) || !knows(i, ret))) return -1;
        }
        return ret;
    }

    public int findCelebrityBF(int n) {
        boolean[] candidates = new boolean[n];
        Arrays.fill(candidates, true);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (candidates[i] && i != j) {
                    if (knows(i, j) || !knows(j, i)) {
                        candidates[i] = false;
                        break;
                    } else
                        candidates[j] = false;
                }
            }
            if (candidates[i]) return i;
        }
        return -1;
    }
}
