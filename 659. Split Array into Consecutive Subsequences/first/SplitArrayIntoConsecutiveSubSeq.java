package first;

import java.util.HashMap;
import java.util.Map;

public class SplitArrayIntoConsecutiveSubSeq {
    public boolean isPossibleSol1(int[] nums) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Map<Integer, Integer> map3 = new HashMap<>();

        for (int num : nums) {
            if (map1.containsKey(num - 1)) {
                map1.put(num - 1, map1.get(num - 1) - 1);
                if (map1.get(num - 1) == 0) map1.remove(num - 1);
                map2.put(num, map2.getOrDefault(num, 0) + 1);
            } else if (map2.containsKey(num - 1)) {
                map2.put(num - 1, map2.get(num - 1) - 1);
                if (map2.get(num - 1) == 0) map2.remove(num - 1);
                map3.put(num, map3.getOrDefault(num, 0) + 1);
            } else if (map3.containsKey(num - 1) && map3.get(num - 1) > 0) {
                map3.put(num - 1, map3.getOrDefault(num - 1, 0) - 1);
                map3.put(num, map3.getOrDefault(num, 0) + 1);
            } else
                map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        return map1.size() == 0 && map2.size() == 0;
    }

    public boolean isPossibleSol2(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>(), endOfSeq = new HashMap<>();

        // count frequency of each number
        for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);

        // check if numbers can be split into consecutive sequence
        for (int num : nums) {
            if (freq.get(num) == 0) continue;

            if (endOfSeq.getOrDefault(num, 0) > 0) {
                // 1. num is end of any sequences that previous constructed
                endOfSeq.put(num, endOfSeq.get(num) - 1);
                endOfSeq.put(num + 1, endOfSeq.getOrDefault(num + 1, 0) + 1);
            } else if (freq.getOrDefault(num + 1, 0) > 0 && freq.getOrDefault(num + 2, 0) > 0) {
                // 2. num is start of a 3-chars-long sequence
                freq.put(num + 1, freq.get(num + 1) - 1);
                freq.put(num + 2, freq.get(num + 2) - 1);
                endOfSeq.put(num + 3, endOfSeq.getOrDefault(num + 3, 0) + 1);
            } else return false;

            freq.put(num, freq.get(num) - 1);
        }

        return true;
    }
}
