package first;

public class PartitionToDisjointSet {
    public int partitionDisjoint(int[] A) {
        int count = 0;
        int maxValInLeft = A[0];

        for (int i = 0; i < A.length; i++) {
            count = i + 1;
            maxValInLeft = Math.max(maxValInLeft, A[i]);
            int j;
            for (j = i + 1; j < A.length; j++) {
                if (A[j] < maxValInLeft) break;
            }
            if (j == A.length) break;
        }
        return count;
    }
}
