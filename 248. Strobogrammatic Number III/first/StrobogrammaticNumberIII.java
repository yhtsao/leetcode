package first;

import java.util.Map;
import java.util.TreeMap;

public class StrobogrammaticNumberIII {
    public int strobogrammaticInRange(String low, String high) {
        Map<Character, Character> map = new TreeMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');

        int count = 0;
        for (int len = low.length(); len <= high.length(); len++) {
            count += recur(low, high, "", len);
            count += recur(low, high, "0", len);
            count += recur(low, high, "1", len);
            count += recur(low, high, "8", len);
        }
        return count;
    }

    private int recur(String low, String high,
                      String result, int len) {
        int count = 0;
        if (result.length() > len) return 0;
        if (result.length() == len) {
            if ((len == low.length() && result.compareTo(low) < 0)
                    || (len == high.length() && result.compareTo(high) > 0)
                    || result.charAt(0) == '0')
                return 0;
            return 1;
        }

        count += recur(low, high, new StringBuilder().append("0").append(result).append("0").toString(), len);
        count += recur(low, high, new StringBuilder().append("1").append(result).append("1").toString(), len);
        count += recur(low, high, new StringBuilder().append("6").append(result).append("9").toString(), len);
        count += recur(low, high, new StringBuilder().append("8").append(result).append("8").toString(), len);
        count += recur(low, high, new StringBuilder().append("9").append(result).append("6").toString(), len);
        return count;
    }
}
