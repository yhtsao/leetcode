package first;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length + 1];
        int x = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            x += digits[i];
            digits[i] = x % 10;
            res[i + 1] = x % 10;
            x /= 10;
            if (x <= 0) break;
        }

        if (x > 0) {
            res[0] = x;
        }
        return x > 0 ? res : digits;
    }
}
