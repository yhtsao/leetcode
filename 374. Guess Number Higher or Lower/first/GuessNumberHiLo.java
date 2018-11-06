package first;

public class GuessNumberHiLo {
    private int guess(int pick) {
        return 0;
    }

    public int guessNumber(int n) {
        if (n < 2) return n;
        int lo = 1, hi = n;
        int pick = n / 2;
        int ret = guess(pick);
        while (ret != 0 && hi != lo) {
            if (ret > 0) {
                lo = pick;
                pick += (hi - lo) / 2;
                if (hi == lo + 1) pick++;
            }
            else {
                hi = pick;
                pick -= (hi - lo + 1) / 2;
            }

            if (pick < 0) return pick;
            ret = guess(pick);
        }
        return pick;
    }

    public int guessNumberRecur(int n) {
        if (n < 2) return n;
        return recur(1, n + 1);
    }

    private int recur(int lo, int hi) {
        int pick = lo + (hi - lo) / 2;
        int ret = guess(pick);
        if (ret == 0) return pick;
        else if (ret > 0) {
            pick = recur(pick + 1, hi);
        }
        else {
            pick = recur(lo, pick);
        }
        return pick;
    }
}
