package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSquares {

    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> ret = new ArrayList<>();
        Map<String, List<String>> map = buildPrefixMap(words);
        backtracking(words[0].length(), map, new ArrayList<>(), ret);
        return ret;
    }

    private Map<String, List<String>> buildPrefixMap(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        map.put("", new ArrayList<>());
        for (String word : words) {
            map.get("").add(word);
            for (int i = 1; i <= word.length(); i++) {
                String subStr = word.substring(0, i);
                map.putIfAbsent(subStr, new ArrayList<>());
                map.get(subStr).add(word);
            }
        }
        return map;
    }

    private void backtracking(int N, Map<String, List<String>> map, List<String> list, List<List<String>> ret) {
        if (list.size() == N) {
            ret.add(new ArrayList<>(list));
            return;
        }

        // get prefix of next string
        StringBuilder next = new StringBuilder();
        int pos = list.size();
        for (String prev : list) {
            next.append(prev.charAt(pos));
        }
        if (!map.containsKey(next.toString())) return;

        for (String word : map.get(next.toString())) {
            list.add(word);
            backtracking(N, map, list, ret);
            list.remove(list.size() - 1);
        }
    }
}
