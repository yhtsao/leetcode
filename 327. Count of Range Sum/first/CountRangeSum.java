package first;

public class CountRangeSum {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] sums = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++)
            sums[i + 1] = sums[i] + nums[i];
        return countByMergeSort(sums, 0, sums.length, lower, upper);
    }

    private int countByMergeSort(long[] sums, int lo, int hi, int lower, int upper) {
        if (hi - lo <= 1) return 0;

        int mid = lo + (hi - lo) / 2;
        int count = countByMergeSort(sums, lo, mid, lower, upper)
                + countByMergeSort(sums, mid, hi, lower, upper);

        int rangeStart = mid, rangeEnd = mid;
        int j = mid, k = 0;
        long[] temp = new long[hi - lo];
        for (int i = lo; i < mid; i++) {
            while (rangeStart < hi && sums[rangeStart] - sums[i] < lower)
                rangeStart++;
            while (rangeEnd < hi && sums[rangeEnd] - sums[i] <= upper)
                rangeEnd++;
            while (j < hi && sums[j] < sums[i]) temp[k++] = sums[j++];
            count += rangeEnd - rangeStart;
            temp[k++] = sums[i];
        }
        System.arraycopy(temp, 0, sums, lo, j - lo);
        return count;
    }
}
