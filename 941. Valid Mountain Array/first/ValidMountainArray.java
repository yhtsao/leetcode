package first;

public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int peek = 0;
        int i = 1;
        while (i < A.length && A[i - 1] < A[i])
            i++;

        if (i == 1 || i == A.length) return false;

        while (i < A.length && A[i - 1] > A[i])
            i++;
        return i == A.length;
    }
}
