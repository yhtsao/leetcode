package first;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElemInArray {
    public int findKthLargest(int[] nums, int k) {
        return findKthLargestQSelect(nums, k);
    }

    private int findKthLargestSort(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    private int findKthLargestPQ(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }

    private int findKthLargestQSelect(int[] nums, int k) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int pivot = hi;
            int i = lo, j = hi;
            while (i < j) {
                if (nums[pivot] < nums[i]) swap(nums, i, --j);
                else i++;
            }
            swap(nums, i, pivot);

            if (i > nums.length - k) hi = i - 1;
            else if (i < nums.length - k) lo = i + 1;
            else return nums[i];
        }
        return nums[lo];
    }

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
