package first;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        return intersectHash(nums1, nums2);
    }

    private int[] intersectHash(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> intersectList = new ArrayList<>();
        for (int num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int num : nums2) {
            if (map.containsKey(num)) {
                intersectList.add(num);
                int cnt = map.get(num);
                cnt--;
                if (cnt == 0)
                    map.remove(num);
                else
                    map.put(num, cnt);
            }
        }
        int[] ret = new int[intersectList.size()];
        for (int i = 0; i < intersectList.size(); i++)
            ret[i] = intersectList.get(i);

        return ret;
    }
}
