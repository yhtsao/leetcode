package first;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count = count + (n & 1);
            n >>>= 1; // unsigned shift
        }
        return count;
    }
}
