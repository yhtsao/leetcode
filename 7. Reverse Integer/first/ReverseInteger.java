package first;

public class ReverseInteger {
    public int reverse(int x) {
        int sum = 0;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        while (x > 0) {
            if ((Integer.MAX_VALUE - x % 10) / 10 < sum)
                return 0;
            sum = sum * 10 + x % 10;
            x /= 10;
        }

        return isNegative ? -sum : sum;
    }
}
