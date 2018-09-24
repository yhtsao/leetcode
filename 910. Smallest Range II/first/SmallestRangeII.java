package first;

import java.util.Arrays;

public class SmallestRangeII {
    public int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
        if (A.length == 0 || A[0] == A[A.length - 1]) return 0;

        int min = A[0];
        int max = A[A.length - 1];
        int result = max - min;
        for (int i = 0; i < A.length - 1; i++) {
            // if A[i] + 2 * K < A[i + 1], minimum must be A[0] + 2 * K
            // otherwise, A[i] + 2 * K > A[i + 1], minimum could be A[0] + 2 * K or A[i + 1]
            min = Math.min(A[0] + 2 * K, A[i + 1]);
            max = Math.max(A[i] + 2 * K, max);
            result = Math.min(result, max - min);
        }

        return result;
    }


}
