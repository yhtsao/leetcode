package first;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElemInArray {
    public int findKthLargest(int[] nums, int k) {
        return findKthLargestPQ(nums, k);
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
}
