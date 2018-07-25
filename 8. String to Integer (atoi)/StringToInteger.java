public class StringToInteger {
    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;
        int val = 0;
        boolean isNegative = false;
        int i = 0;
        while (i < str.length() && str.charAt(i) == ' ') i++;

        if (i < str.length() && str.charAt(i) == '-') {
            isNegative = true;
            i++;
        } else if (i < str.length() && str.charAt(i) == '+') i++;

        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            char c = str.charAt(i++);
            if (val > (Integer.MAX_VALUE - (c - '0')) / 10)
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            val = val * 10 + (c - '0');
        }
        return isNegative ? -val : val;
    }
}
