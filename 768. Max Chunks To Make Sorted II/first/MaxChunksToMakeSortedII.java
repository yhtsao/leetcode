package first;

public class MaxChunksToMakeSortedII {
    public int maxChunksToSorted(int[] arr) {
        int chunk = 1;
        int[] maxValLeftPart = new int[arr.length];
        maxValLeftPart[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
            maxValLeftPart[i] = Math.max(maxValLeftPart[i - 1], arr[i]);

        int[] minValRightPart = new int[arr.length];
        minValRightPart[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--)
            minValRightPart[i] = Math.min(minValRightPart[i + 1], arr[i]);

        for (int i = 0; i < arr.length - 1; i++)
            if (maxValLeftPart[i] <= minValRightPart[i + 1]) chunk++;
        return chunk;
    }
}
