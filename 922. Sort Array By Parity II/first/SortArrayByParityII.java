package first;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        for (int i = 0, j = 1; i < A.length; i += 2, j += 2) {
            while (i < A.length && A[i] % 2 == 0) i += 2;
            while (j < A.length && A[j] % 2 == 1) j += 2;
            if (i < A.length) swap(A, i, j);
        }
        return A;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
