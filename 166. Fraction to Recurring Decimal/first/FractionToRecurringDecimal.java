package first;

import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) return "NaN";
        if (numerator == 0) return "0";

        StringBuilder sb = new StringBuilder();
        if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0))
            sb.append("-");

        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);
        long remain = n % d;
        sb.append(n / d);
        if (remain == 0) return sb.toString();

        Map<Long, Integer> map = new HashMap<>();
        sb.append(".");
        map.put(remain, sb.length());
        while (remain != 0) {
            remain *= 10;
            sb.append(remain / d);
            remain = remain % d;
            if (map.containsKey(remain)) {
                int index = map.get(remain);
                sb.insert(index, "(");
                sb.append(")");
                break;
            } else
                map.put(remain, sb.length());
        }
        return sb.toString();
    }
}
