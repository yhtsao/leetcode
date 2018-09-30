package first;

public class PartitionToDisjointSet {
    public int partitionDisjoint(int[] A) {
        int partitionInx = 0;
        int maxValOfLeftGroup = A[0];
        int max = maxValOfLeftGroup;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < maxValOfLeftGroup) {
                maxValOfLeftGroup = max;
                partitionInx = i;
            } else
                max = Math.max(max, A[i]);

        }
        return partitionInx + 1;
    }
}
