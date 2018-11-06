package first;

import java.util.HashMap;
import java.util.Map;

public class SplitArrayIntoConsecutiveSubSeq {
    public boolean isPossible(int[] nums) {
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
}
