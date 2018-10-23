package first;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSum {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        return kSmallestPairsHeap2(nums1, nums2, k);
    }

    List<int[]> kSmallestPairsHeap(int[] nums1, int[] nums2, int k) {
        if (nums1.length == 0 || nums2.length == 0) return new ArrayList<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> o1[0] + o1[1] - o2[0] - o2[1]);
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                heap.offer(new int[]{num1, num2});
            }
        }
        List<int[]> ret = new ArrayList<>();
        for (int i = 0; i < k && !heap.isEmpty(); i++) {
            ret.add(heap.poll());
        }
        return ret;
    }

    List<int[]> kSmallestPairsHeap2(int[] nums1, int[] nums2, int k) {
        if (nums1.length == 0 || nums2.length == 0) return new ArrayList<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> o1[0] + o1[1] - o2[0] - o2[1]);
        List<int[]> ret = new ArrayList<>();
        for (int num1 : nums1)
            heap.offer(new int[]{num1, nums2[0], 0});
        while (k-- > 0 && !heap.isEmpty()) {
            int[] pair = heap.poll();
            ret.add(new int[]{pair[0], pair[1]});
            int nums2Index = pair[2] + 1;
            if (nums2Index == nums2.length) continue;
            heap.offer(new int[]{pair[0], nums2[nums2Index], nums2Index});
        }
        return ret;
    }
}
