package first;

import java.util.*;

public class LFUCache {
    private HashMap<Integer, Integer> keyToVal = new HashMap<>();
    private HashMap<Integer, Integer> keyToFreq = new HashMap<>();
    private HashMap<Integer, LinkedHashSet<Integer>> freqToKeyset = new HashMap<>();
    private int capacity;
    private int minFreq;

    public LFUCache(int capacity) {
        this.keyToVal = new HashMap<>();
        this.keyToFreq = new HashMap<>();
        this.freqToKeyset = new HashMap<>();
        this.capacity = capacity;
        this.minFreq = 0;
    }

    public int get(int key) {
        if (!keyToVal.containsKey(key)) return -1;

        // update frequency
        int freq = keyToFreq.get(key);
        keyToFreq.put(key, freq + 1);

        // update frequency list
        freqToKeyset.get(freq).remove(key);
        if (freq == minFreq && freqToKeyset.get(freq).size() == 0) minFreq++;
        freqToKeyset.compute(freq + 1, (ky, val) -> {
            if (val == null)
                val = new LinkedHashSet<>();
            val.add(key);
            return val;
        });
        return keyToVal.get(key);
    }

    public void put(int key, int value) {
        if (capacity == 0) return;
        if (keyToVal.containsKey(key)) {
            get(key);
            keyToVal.put(key, value);
            return;
        }

        if (keyToVal.size() == capacity) {
            int removedKey = freqToKeyset.get(minFreq).iterator().next();
            freqToKeyset.get(minFreq).remove(removedKey);
            keyToFreq.remove(removedKey);
            keyToVal.remove(removedKey);
        }

        keyToVal.put(key, value);
        keyToFreq.put(key, 1);
        minFreq = 1;
        freqToKeyset.compute(1, (ky, val) -> {
            if (val == null)
                val = new LinkedHashSet<>();
            val.add(key);
            return val;
        });
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
