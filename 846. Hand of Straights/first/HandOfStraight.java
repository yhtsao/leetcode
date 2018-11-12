package first;

import java.util.*;

public class HandOfStraight {
    // Hashmap, time: O(NlogN + NW), space: O(M)
    // N is length of hand, M is number of unique card
    public boolean isNStraightHandHashMap(int[] hand, int W) {
        if (W == 0 || hand.length % W != 0) return false;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : hand)
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        Arrays.sort(hand);
        for (int i = 0; i < hand.length; i++) {
            if (freq.get(hand[i]) == 0) continue;
            freq.put(hand[i], freq.get(hand[i]) - 1);
            for (int j = 1; j < W; j++) {
                if (freq.getOrDefault(hand[i] + j, 0) == 0) return false;
                freq.put(hand[i] + j, freq.get(hand[i] + j) - 1);
            }
        }
        return true;
    }

    // TreeMap, time: O(NlogM + MW)
    // N is length of hand, M is number of unique card
    public boolean isNStraightHandTreeMap(int[] hand, int W) {
        if (W == 0 || hand.length % W != 0) return false;
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int num : hand) // (NlogM)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 0) continue;
            for (int j = 1; j < W; j++) {
                if (freq.getOrDefault(entry.getKey() + j, 0) < entry.getValue()) return false;
                freq.put(entry.getKey() + j, freq.get(entry.getKey() + j) - entry.getValue());
            }
            entry.setValue(0);
        }
        return true;
    }

    // TreeMap with deque, time: O(NlogM)
    public boolean isNStraightHand(int[] hand, int W) {
        if (W == 0 || hand.length % W != 0) return false;
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int num : hand)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        Deque<Integer> deque = new LinkedList<>(); // record the number of open sequences end at i
        int last = 0; // the last element of previous sequence
        int openCnt = 0; // current number of open sequence
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if ((openCnt > 0 && last + 1 != entry.getKey()) || openCnt > entry.getValue()) return false;
            deque.offerLast(entry.getValue() - openCnt);
            openCnt = entry.getValue();
            last = entry.getKey();
            if (deque.size() == W) openCnt -= deque.pollFirst();
        }
        return openCnt == 0;
    }
}
