package first;

import java.util.TreeSet;

public class KEmptySlots {

    /**
     * @param flowers: the place where the flower will open in that day
     * @param k:       an integer
     * @return: in which day meet the requirements
     */
    public int kEmptySlots(int[] flowers, int k) {
        return kEmptySlotsBIT(flowers, k);
    }

    private int kEmptySlotsBF(int[] flowers, int k) {
        boolean[] blooming = new boolean[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            int slot = flowers[i] - 1;
            blooming[slot] = true;
            // Check left side of slots
            if (slot - k - 1 >= 0 && blooming[slot - k - 1]) {
                int j;
                for (j = slot - k; j < slot; j++)
                    if (blooming[j]) break;
                if (j == slot) return i + 1;
            }
            // Check right side of slots
            if (slot + k + 1 < blooming.length && blooming[slot + k + 1]) {
                int j;
                for (j = slot + 1; j < slot + k + 1; j++)
                    if (blooming[j]) break;
                if (j == slot + k + 1) return i + 1;
            }
        }
        return -1;
    }

    private int kEmptySlotsTreeset(int[] flowers, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < flowers.length; i++) {
            Integer upper = set.ceiling(flowers[i]);
            Integer lower = set.floor(flowers[i]);
            if (upper != null && upper - flowers[i] - 1 == k) return i + 1;
            if (lower != null && flowers[i] - lower - 1 == k) return i + 1;
            set.add(flowers[i]);
        }
        return -1;
    }

    private int kEmptySlotsSlidingWindow(int[] flowers, int k) {
        int[] days = new int[flowers.length];
        for (int i = 0; i < flowers.length; i++)
            days[flowers[i] - 1] = i + 1;
        int left = 0, right = k + 1;
        int ret = Integer.MAX_VALUE;
        for (int i = 1; right < days.length; i++) {
            if (days[i] < days[left] || days[i] <= days[right]) {
                if (i == right) ret = Math.min(ret, Math.max(days[left], days[right]));
                left = i;
                right = k + i + 1;
            }
        }
        return ret == Integer.MAX_VALUE ? -1 : ret;
    }

    // --------------------------------------------------------
    // Binary indexed tree (Fenwick tree)
    // --------------------------------------------------------
    private void update(int[] bit, int index) {
        for (int i = index; i < bit.length; i += i & -i) {
            bit[i]++;
        }
    }

    private int getSum(int[] bit, int index) {
        int sum = 0;
        for (int i = index; i > 0; i -= i & -i)
            sum += bit[i];
        return sum;
    }

    private int kEmptySlotsBIT(int[] flowers, int k) {
        boolean[] blooming = new boolean[flowers.length + 1];
        int[] bit = new int[flowers.length + 1]; // binary index tree
        for (int i = 0; i < flowers.length; i++) {
            int slotNum = flowers[i];
            update(bit, slotNum);
            blooming[slotNum] = true;
            // check right side of current slot
            if (slotNum + k + 1 < bit.length
                    && getSum(bit, slotNum + k + 1) - getSum(bit, slotNum) == 1
                    && blooming[slotNum + k + 1]) {
                return i + 1;
            }
            // check left side of current slot
            if (slotNum - k - 1 > 0
                    && getSum(bit, slotNum) - getSum(bit, slotNum - k - 1) == 1
                    && blooming[slotNum - k - 1]) {
                return i + 1;
            }
        }
        return -1;
    }
}
