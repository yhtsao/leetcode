package first;

import java.util.HashMap;
import java.util.Map;

public class CanIWin {
    // time: O(2^n), space: O(2^n)
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (maxChoosableInteger >= desiredTotal) return true;
        if (maxChoosableInteger * (maxChoosableInteger + 1) < 2 * desiredTotal) return false;

        return canWin(0, desiredTotal, maxChoosableInteger, 0, new HashMap<>());
    }

    // state[i] = 0: not used
    //          = 1: used
    private boolean canWin(int sum, int target, int maxNum, int state, Map<Integer, Boolean> memo) {
        if (memo.containsKey(state)) return memo.get(state);

        for (int i = 1; i <= maxNum; i++) {
            int mask = 1 << i;
            if ((state & mask) == 0) {
                if (sum + i >= target || !canWin(sum + i, target, maxNum, state | mask, memo)) {
                    memo.put(state, true);
                    return true;
                }
            }
        }
        memo.put(state, false);
        return false;
    }
}
