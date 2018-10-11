package first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreakII {
    public List<String> wordBreak(String s, List<String> wordDict) {
        return wordBreak(s, wordDict, new HashMap<>());
    }

    private List<String> wordBreak(String s, List<String> wordDict, Map<String, List<String>> map) {
        if (map.containsKey(s))
            return map.get(s);

        List<String> res = new ArrayList<>();
        if (s.isEmpty()) return res;

        for (String word : wordDict) {
            if (s.startsWith(word)) {
                String subStr = s.substring(0, word.length());
                if (subStr.equals(word)) {
                    if (s.length() == word.length()) res.add(word);
                    else {
                        List<String> subRes = wordBreak(s.substring(word.length()), wordDict, map);
                        for (String sub : subRes)
                            res.add(subStr + " " + sub);
                    }
                }
            }
        }
        map.put(s, res);
        return res;
    }
}
