package first;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinGeneticMutation {
    final char[] geneChars = new char[]{'A', 'C', 'G', 'T'};

    public int minMutation(String start, String end, String[] bank) {
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        Set<String> startSet = new HashSet<>(), endSet = new HashSet<>();
        Set<String> visited = new HashSet<>();
        if (!bankSet.contains(end)) return -1;
        startSet.add(start);
        endSet.add(end);
        visited.add(start);
        visited.add(end);
        int len = 0;
        while (!startSet.isEmpty() && !endSet.isEmpty()) {
            Set<String> tmpSet = new HashSet<>();
            for (String gene : startSet) {
                char[] chars = gene.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char c = chars[i];
                    for (char geneChar : geneChars) {
                        chars[i] = geneChar;
                        String next = new String(chars);
                        if (endSet.contains(next)) return len + 1;
                        if (bankSet.contains(next) && visited.add(next))
                            tmpSet.add(next);
                    }
                    chars[i] = c;
                }
            }
            len++;
            if (tmpSet.size() < endSet.size()) {
                startSet = endSet;
                endSet = tmpSet;
            } else
                startSet = tmpSet;
        }
        return -1;
    }
}
