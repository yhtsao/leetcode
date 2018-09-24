package first;

import java.util.Arrays;

public class SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        if (A.length == 0 || A[0] == A[A.length - 1]) return 0;

        int diff = A[A.length - 1] - A[0];
        return diff <= K * 2 ? 0 : diff - K * 2;
    }
}
