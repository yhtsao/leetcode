package first;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String strKey = new String(chars);

            if (map.containsKey(strKey))
                map.get(strKey).add(str);
            else
                map.put(strKey, new ArrayList<>(Arrays.asList(str)));
        }
        return new ArrayList<>(map.values());
    }
}
