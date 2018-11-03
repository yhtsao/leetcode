package first;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public int totalFruit(int[] tree) {
        int max = 0, first = 0, second = 0;
        int cnt = 0, numOfSecond = 0;
        for (int i = 0; i < tree.length; i++) {
            if (tree[i] == second) {
                cnt++;
                numOfSecond++;
            } else if (tree[i] == first) {
                cnt++;
                numOfSecond = 1;
                first = second;
                second = tree[i];
            } else {
                cnt = numOfSecond + 1;
                numOfSecond = 1;
                first = second;
                second = tree[i];
            }
            max = Math.max(max, cnt);
        }
        return max;
    }

    public int totalFruitHash(int[] tree) {
        int max = 0, start = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tree.length; i++) {
            map.put(tree[i], map.getOrDefault(tree[i], 0) + 1);
            while (map.size() > 2) {
                map.put(tree[start], map.get(tree[start]) - 1);
                if (map.get(tree[start]) == 0) map.remove(tree[start]);
                start++;
            }
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
