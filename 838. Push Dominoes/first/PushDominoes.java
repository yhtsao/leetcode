package first;

public class PushDominoes {
    // consider four situations:
    // 1. L.....R -> L.....R
    // 2. L.....L -> LLLLLLL
    // 3. R.....R -> RRRRRRR
    // 4. R.....L -> RRR.LLL or RRRLLL
    public String pushDominoes(String dominoes) {
        int l = 0, r = 0;
        char[] ret = dominoes.toCharArray();
        for (int i = 0; i < ret.length; i++) {
            if (ret[i] == 'L') {
                if (l >= r) fill(ret, l, i);
                else fill(ret, r, i);
                l = i;
            } else if (ret[i] == 'R') {
                if (r >= l) fill(ret, r, i);
                r = i;
            }
        }
        if (r >= l)
            fill(ret, r, ret.length - 1);
        return String.valueOf(ret);
    }

    private void fill(char[] chunks, int s, int e) {
        if (chunks[s] == 'R' && chunks[e] == 'L') {
            while (s < e) {
                chunks[s++] = 'R';
                chunks[e--] = 'L';
            }
        } else if (chunks[s] == 'R') {
            while (s <= e)
                chunks[s++] = 'R';
        } else if (chunks[e] == 'L') {
            while (s <= e)
                chunks[e--] = 'L';
        }
    }
}
