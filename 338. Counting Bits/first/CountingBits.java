package first;

public class CountingBits {
    public int[] countBits(int num) {
        int[] cnt = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            cnt[i] = cnt[i >> 1] + (i & 1);
        }
        return cnt;
    }
}
