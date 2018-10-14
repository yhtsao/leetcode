package first;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortArrayByParityIITest {
    @Test
    public void test01() {
        SortArrayByParityII sol = new SortArrayByParityII();
        int[] A = new int[]{4, 2, 5, 7};
        System.out.println(Arrays.toString(sol.sortArrayByParityII(A)));

        A = new int[]{1, 4};
        System.out.println(Arrays.toString(sol.sortArrayByParityII(A)));

        A = new int[]{1, 3, 4, 5, 2, 6};
        System.out.println(Arrays.toString(sol.sortArrayByParityII(A)));

        A = new int[]{0, 1, 5, 3, 4, 2};
        System.out.println(Arrays.toString(sol.sortArrayByParityII(A)));
    }
}
