package first;

import sun.jvm.hotspot.debugger.windbg.DLL;

import java.util.ArrayList;
import java.util.List;

public class KEmptySlots {

    /**
     * @param flowers: the place where the flower will open in that day
     * @param k:       an integer
     * @return: in which day meet the requirements
     */
    public int kEmptySlots(int[] flowers, int k) {
        return KEmptySlotsSlidingWindow(flowers, k);
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

    // Memory exceed
    private int KEmptySlotsBinaryInsert(int[] flowers, int k) {
        List<Integer> slots = new ArrayList<>();
        for (int i = 0; i < flowers.length; i++) {
            int index = binaryInsert(slots, flowers[i]);
            if (index > 0 && slots.get(index) - slots.get(index - 1) - 1 == k)
                return i + 1;
            if (index < slots.size() - 1 && slots.get(index + 1) - slots.get(index) - 1 == k)
                return i + 1;
        }
        return -1;
    }

    private int binaryInsert(List<Integer> list, int num) {
        int lo = 0, hi = list.size();
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (list.get(mid) < num)
                lo = mid + 1;
            else
                hi = mid;
        }
        list.add(lo, num);
        return lo;
    }

    private int KEmptySlotsSlidingWindow(int[] flowers, int k) {
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

}
