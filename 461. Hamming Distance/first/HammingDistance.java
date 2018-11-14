package first;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int diff = x ^ y;
        int cnt = 0;
        for (int i = 0; i < 32; i++)
            if ((diff >> i & 1) == 1) cnt++;
        return cnt;
    }
}
