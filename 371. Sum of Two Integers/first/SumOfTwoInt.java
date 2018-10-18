package first;

public class SumOfTwoInt {
    /**
     * a = 12 (1100), b = 7 (0111)
     * -> a ^ b = 11(1011), a & b = 4 (0100)
     * <p>
     * a = 11 (1011), b = 4 << 1 = 8 (1000)
     * -> a ^ b = 3 (0011), a & b = 8 (1000)
     * <p>
     * a = 3 (00011), b = 8 << 1 = 16 (10000)
     * -> a ^ b = 19 (10011), a & b = 0 (00000)
     */
    public int getSum(int a, int b) {
        return (b == 0) ? a : getSum(a ^ b, (a & b) << 1);
    }
}
