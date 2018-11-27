package first;

import java.util.*;

public class AutocompleteSystem {
    Map<String, Integer> map;
    List<Map.Entry<String, Integer>> matches;
    StringBuilder currInput;

    public AutocompleteSystem(String[] sentences, int[] times) {
        this.map = new HashMap<>();
        this.matches = new ArrayList<>();
        this.currInput = new StringBuilder();

        for (int i = 0; i < sentences.length; i++) {
            map.put(sentences[i], times[i]);
        }
    }

    public List<String> input(char c) {
        List<String> ret = new ArrayList<>();
        if (c == '#') {
            map.put(currInput.toString(), map.getOrDefault(currInput.toString(), 0) + 1);
            currInput = new StringBuilder(); // clear string builder
            matches.clear();
        } else {
            currInput.append(c);
            String str = currInput.toString();
            if (str.length() == 1) {
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getKey().startsWith(str))
                        matches.add(entry);
                }
                Collections.sort(matches, (a, b) -> (a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey())
                        : b.getValue().compareTo(a.getValue())));
            } else {
                Iterator<Map.Entry<String, Integer>> iter = matches.iterator();
                while (iter.hasNext()) {
                    if (!iter.next().getKey().startsWith(str)) iter.remove();
                }
            }
            for (int i = 0; i < Math.min(3, matches.size()); i++)
                ret.add(matches.get(i).getKey());

        }
        return ret;
    }
}

/**
 * Your AutocompleteSystem object will be instantiated and called as such:
 * AutocompleteSystem obj = new AutocompleteSystem(sentences, times);
 * List<String> param_1 = obj.input(c);
 */
