package first;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EvaluateDivision {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        Map<String, Map<String, Double>> relations = new HashMap<>();
        for (int i = 0; i < equations.length; i++) {
            relations.putIfAbsent(equations[i][0], new HashMap<>());
            relations.putIfAbsent(equations[i][1], new HashMap<>());
            relations.get(equations[i][0]).put(equations[i][1], values[i]);
            relations.get(equations[i][1]).put(equations[i][0], 1 / values[i]);
        }
        double[] ret = new double[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String[] query = queries[i];
            ret[i] = dfs(query[0], query[1], 1, relations, new HashSet<>());
        }
        return ret;
    }

    private double dfs(String s, String t, double value, Map<String, Map<String, Double>> relations, Set<String> visited) {
        if (!relations.containsKey(s) || !visited.add(s)) return -1;
        if (s.equals(t)) return value;

        Map<String, Double> relation = relations.get(s);
        double result = -1;
        for (Map.Entry<String, Double> entry : relation.entrySet()) {
            result = dfs(entry.getKey(), t, entry.getValue() * value, relations, visited);
            if (result > 0) return result;
        }
        return result;
    }
}
