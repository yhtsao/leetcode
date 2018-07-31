public class DivideTwoInt {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long n = dividend;
        long d = divisor;
        n = Math.abs(n);
        d = Math.abs(d);

        int q = 0;
        while (n >= d) {
            long tmp = d, mul = 1;
            while (tmp < n >> 1) {
                tmp <<= 1;
                mul <<= 1;
            }
            n -= tmp;
            q += mul;
        }
        return isNegative ? -q : q;
    }
}
