package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ThreeEqualPartsTest {
    ThreeEqualParts sol = new ThreeEqualParts();

    @Test
    public void test01() {
        int[] A = new int[]{1, 0, 1, 0, 1};
        int[] ans = {0, 3};
        int[] ret = sol.threeEqualParts(A);
        Assertions.assertTrue(Arrays.equals(ans, ret));
    }

    @Test
    public void test02() {
        int[] A = new int[]{1, 0, 1, 0, 0};
        int[] ans = {-1, -1};
        int[] ret = sol.threeEqualParts(A);
        Assertions.assertTrue(Arrays.equals(ans, ret));
    }

    @Test
    public void test03() {
        int[] A = new int[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1};
        int[] ans = {5, 10};
        int[] ret = sol.threeEqualParts(A);
        Assertions.assertTrue(Arrays.equals(ans, ret));
    }


}
