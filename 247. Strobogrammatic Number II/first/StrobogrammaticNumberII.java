package first;

import java.util.*;

public class StrobogrammaticNumberII {
    /**
     * @param n: the length of strobogrammatic number
     * @return: All strobogrammatic numbers
     */
    public List<String> findStrobogrammatic(int n) {
        Map<String, String> map = new HashMap<>();
        map.put("0", "0");
        map.put("1", "1");
        map.put("8", "8");
        map.put("6", "9");
        map.put("9", "6");

        List<String> res = recur(map, n, n);
        return res;
    }

    private List<String> recur(Map<String, String> map, int target, int n) {
        List<String> res = new ArrayList<>();
        if (n == 1)
            return Arrays.asList("0", "1", "8");
        if (n == 0) {
            res.add("");
            return res;
        }

        List<String> innerStrList = recur(map, target, n - 2);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            for (String innerStr : innerStrList) {
                if (target == n && entry.getKey().equals("0")) continue;
                StringBuilder sb = new StringBuilder();
                sb.append(entry.getKey()).append(innerStr).append(entry.getValue());
                res.add(sb.toString());
            }
        }
        return res;
    }
}
