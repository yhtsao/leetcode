package first;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KSmallestElemInSortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        return kthSmallestBinarySearchV2(matrix, k);
    }

    private int kthSmallestHeap(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                heap.offer(matrix[i][j]);
                if (heap.size() > matrix.length * matrix[0].length - k + 1)
                    heap.poll();
            }
        }
        return heap.peek();
    }

    private int kthSmallestHeapV2(int[][] matrix, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(k, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        for (int i = 0; i < matrix[0].length; i++)
            heap.offer(new int[]{0, i, matrix[0][i]});
        for (int i = 1; i < k; i++) {
            int[] min = heap.poll();
            if (min[0] == matrix.length - 1) continue;
            int row = min[0], col = min[1];
            heap.offer(new int[]{row + 1, col, matrix[row + 1][col]});
        }
        return heap.poll()[2];
    }

    private int kthSmallestBinarySearch(int[][] matrix, int k) {
        int lo = matrix[0][0], hi = matrix[matrix.length - 1][matrix[0].length - 1];
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int cnt = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] <= mid) cnt++;
                }
            }
            if (cnt < k) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    private int kthSmallestBinarySearchV2(int[][] matrix, int k) {
        int lo = matrix[0][0], hi = matrix[matrix.length - 1][matrix[0].length - 1];
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int cnt = 0;
            int i = matrix.length - 1, j = 0;
            while (i >= 0 && j < matrix[0].length) {
                if (matrix[i][j] <= mid) {
                    cnt += i + 1;
                    j++;
                } else
                    i--;
            }
            if (cnt < k) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
