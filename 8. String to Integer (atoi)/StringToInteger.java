public class StringToInteger {
    public int myAtoi(String str) {
        int val = 0;
        boolean isNegative = false;
        boolean isDigit = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ' && !isDigit) continue;

            if (c == '-' && !isDigit) {
                isNegative = true;
                isDigit = true;
            } else if (c == '+' && !isDigit) {
                isDigit = true;
            } else if (c >= '0' && c <= '9') {
                if (val > (Integer.MAX_VALUE - (c - '0')) / 10)
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                val = val * 10 + (c - '0');
                isDigit = true;
            } else break;
        }
        return isNegative ? -val : val;
    }
}
