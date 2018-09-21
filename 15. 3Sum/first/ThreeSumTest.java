package first;

import org.junit.jupiter.api.Test;

import java.util.List;

class ThreeSumTest {
    @Test
    public void test1() {
        int nums[] = new int[]{-1, 0, 1, 2, -1, -4};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> ans = threeSum.threeSum(nums);
        for (List<Integer> list : ans)
            System.out.println(list.toString());
    }

    @Test
    public void test2() {
        int nums[] = new int[]{-1, 0, 1, 5, -1, -4, 5};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> ans = threeSum.threeSum(nums);
        for (List<Integer> list : ans)
            System.out.println(list.toString());
    }
}