package first;

import java.util.Arrays;

public class MinIncreMakeUnique {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int cnt = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                cnt += A[i - 1] - A[i] + 1;
                A[i] += A[i - 1] - A[i] + 1;
            }
        }
        return cnt;
    }
}
