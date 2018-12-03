package first;

import java.util.HashSet;
import java.util.Set;

public class ClosestPalindrome {
    public String nearestPalindromic(String n) {
        Set<Long> possibleNum = new HashSet<>();
        int len = n.length();
        long num = Long.parseLong(n);
        long prefix = Long.parseLong(n.substring(0, (len + 1) / 2));
        possibleNum.add((long) Math.pow(10, len - 1) - 1); // 99..9
        possibleNum.add((long) Math.pow(10, len) + 1); // 10..001

        for (int i = -1; i <= 1; i++) {
            String pre = Long.toString(prefix + i);
            StringBuilder sb = new StringBuilder().append(pre.substring(0, pre.length() - (len & 1))).reverse();
            possibleNum.add(Long.parseLong(pre + sb.toString()));
        }
        possibleNum.remove(num);

        long minDiff = Long.MAX_VALUE;
        long ret = 0;
        for (Long a : possibleNum) {
            long diff = Math.abs(a - num);
            if (diff < minDiff) {
                ret = a;
                minDiff = diff;
            } else if (diff == minDiff)
                ret = Math.min(a, ret);
        }
        return Long.toString(ret);
    }
}
