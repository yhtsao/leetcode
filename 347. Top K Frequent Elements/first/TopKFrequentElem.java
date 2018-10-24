package first;

import java.util.*;

public class TopKFrequentElem {
    // bucket sort
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        List<Integer>[] bucket = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(entry.getKey());
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && ret.size() < k; i--)
            if (bucket[i] != null)
                ret.addAll(bucket[i]);
        return ret;
    }
}
