package first;

public class ThreeEqualParts {
    public int[] threeEqualParts(int[] A) {
        // Count number of 1's in A
        int countOnes = 0;
        for (int a : A)
            if (a == 1) countOnes++;

        // all 1's in A in be multiple of 3
        if (countOnes == 0) return new int[]{0, A.length - 1};
        if (countOnes % 3 != 0) return new int[]{-1, -1};
        int onesInEachPartition = countOnes / 3;

        // move start pointer to first non zero position
        int start = 0;
        for (; start < A.length; start++)
            if (A[start] == 1) break;

        // get the first 1's of second part
        int mid = start;
        for (int cnt = 0; cnt <= onesInEachPartition && mid < A.length; mid++)
            if (A[mid] == 1) cnt++;
        mid--;

        // get the first 1's of third part
        int end = mid;
        for (int cnt = 0; cnt <= onesInEachPartition && end < A.length; end++)
            if (A[end] == 1) cnt++;
        end--;

        // Check three part have same value
        while (end < A.length && A[start] == A[mid] && A[mid] == A[end]) {
            start++;
            mid++;
            end++;
        }

        if (end != A.length) return new int[]{-1, -1};

        return new int[]{start - 1, mid};
    }
}
