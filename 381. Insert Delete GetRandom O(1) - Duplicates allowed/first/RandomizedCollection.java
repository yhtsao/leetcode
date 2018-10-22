package first;

import java.util.*;

public class RandomizedCollection {
    Map<Integer, List<Integer>> map;
    List<int[]> nums; // [val, index in map value list]
    Random rand;

    /**
     * Initialize your data structure here.
     */
    public RandomizedCollection() {
        this.map = new HashMap<>();
        this.nums = new ArrayList<>();
        this.rand = new Random();
    }

    /**
     * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
     */
    public boolean insert(int val) {
        boolean isNotContain = false;
        if (!map.containsKey(val)) {
            map.put(val, new ArrayList<>());
            isNotContain = true;
        }
        map.get(val).add(nums.size());
        nums.add(new int[]{val, map.get(val).size() - 1});
        return isNotContain;
    }

    /**
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        List<Integer> removedIndexList = map.get(val);
        int removedIndex = removedIndexList.get(removedIndexList.size() - 1);
        if (removedIndex != nums.size() - 1) {
            int[] lastElem = nums.get(nums.size() - 1);
            map.get(lastElem[0]).set(lastElem[1], removedIndex);
            nums.set(removedIndex, lastElem);
        }
        removedIndexList.remove(removedIndexList.size() - 1);
        nums.remove(nums.size() - 1);
        if (removedIndexList.isEmpty()) map.remove(val);
        return true;
    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()))[0];
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
