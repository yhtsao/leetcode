package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KEmptySlotsTest {
    KEmptySlots sol = new KEmptySlots();

    @Test
    public void test01() {
        int[] flowers = new int[]{1, 3, 2};
        int k = 1;
        int ans = 2;
        Assertions.assertEquals(ans, sol.kEmptySlots(flowers, k));
    }

    @Test
    public void test02() {
        int[] flowers = new int[]{1, 5, 4, 3, 2};
        int k = 1;
        int ans = 4;
        Assertions.assertEquals(ans, sol.kEmptySlots(flowers, k));
    }

    @Test
    public void test03() {
        int[] flowers = new int[]{6, 5, 8, 9, 7, 1, 10, 2, 3, 4};
        int k = 2;
        int ans = 8;
        Assertions.assertEquals(ans, sol.kEmptySlots(flowers, k));
    }

    @Test
    public void test04() {
        int[] flowers = new int[]{1, 2, 3, 4};
        int k = 1;
        int ans = -1;
        Assertions.assertEquals(ans, sol.kEmptySlots(flowers, k));
    }
}
