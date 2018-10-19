package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordDistance {
    Map<String, List<Integer>> map;

    public WordDistance(String[] words) {
        this.map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            List<Integer> list = map.computeIfAbsent(words[i], value -> new ArrayList<>());
            list.add(i);
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> indexOfWord1 = map.get(word1);
        List<Integer> indexOfWord2 = map.get(word2);
        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while (i < indexOfWord1.size() && j < indexOfWord2.size()) {
            min = Math.min(min, Math.abs(indexOfWord1.get(i) - indexOfWord2.get(j)));
            if (indexOfWord1.get(i) < indexOfWord2.get(j)) i++;
            else j++;
        }
        return min;
    }
}
