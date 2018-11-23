package first;

import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                        if (a.getValue().equals(b.getValue())) return b.getKey().compareTo(a.getKey());
                        return a.getValue().compareTo(b.getValue());
                    }
                });

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k)
                pq.poll();
        }

        List<String> ret = new ArrayList<>();
        while (!pq.isEmpty())
            ret.add(0, pq.poll().getKey());

        return ret;
    }
}
