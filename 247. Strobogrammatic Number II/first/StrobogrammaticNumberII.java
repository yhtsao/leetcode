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

        if (n == 0) return new ArrayList<>();
        if (n == 1) return Arrays.asList("0", "1", "8");

        List<String> dfsResult = dfs(map, n);
        List<String> res = new ArrayList<>();
        for (String num : dfsResult)
            if (num.charAt(0) != '0') res.add(num);
        return res;
    }

    private List<String> dfs(Map<String, String> map, int n) {
        List<String> res = new ArrayList<>();
        if (n == 1)
            return Arrays.asList("0", "1", "8");
        if (n == 0) {
            res.add("");
            return res;
        }

        List<String> otherList = dfs(map, n - 2);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            for (String other : otherList) {
                StringBuilder sb = new StringBuilder();
                sb.append(entry.getKey()).append(other).append(entry.getValue());
                res.add(sb.toString());
            }
        }
        return res;
    }
}
