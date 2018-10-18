package first;

public class ReverseBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        return reverseBitsMove(n);
    }

    /**
     * ABCDEFGH
     * -> EFGH ABCD
     * -> GH EF CD AB
     * -> H G F E D C B A
     */
    private int reverseBitsMove(int n) {
        n = n >>> 16 | n << 16;
        n = (n & 0xFF00FF00) >>> 8 | (n & 0x00FF00FF) << 8;
        n = (n & 0xF0F0F0F0) >>> 4 | (n & 0x0F0F0F0F) << 4;
        n = (n & 0xCCCCCCCC) >>> 2 | (n & 0x33333333) << 2;
        n = (n & 0xAAAAAAAA) >>> 1 | (n & 0x55555555) << 1;
        return n;
    }

    private int reverseBitsShift(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            ret <<= 1;
            ret += n & 1;
            n >>>= 1; // unsigned shift
        }
        return ret;
    }
}
