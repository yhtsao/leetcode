package first;

import java.util.HashMap;
import java.util.Map;

public class KindInDeck {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            map.compute(deck[i], (k, v) -> {
                if (v == null)
                    v = new Integer(1);
                else
                    v++;
                return v;
            });
        }

        int gcd = map.get(deck[0]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            gcd = Math.min(gcd, gcd(entry.getValue(), gcd));
            if (gcd == 1)
                return false;
        }

        return true;
    }

    private int gcd(int m, int n) {
        int result;
        while (m % n != 0) {
            result = n;
            n = m % n;
            m = result;
        }
        return n;
    }
}
