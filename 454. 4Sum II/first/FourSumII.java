package first;

import java.util.HashMap;

public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                map.compute(A[i] + B[j], (key, val) -> {
                    if (val == null)
                        val = 0;
                    val++;
                    return val;
                });
            }
        }

        int count = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                Integer numTuplesFromAB = map.get(-(C[i] + D[j]));
                if (numTuplesFromAB != null) count += numTuplesFromAB;
            }
        }
        return count;
    }
}
