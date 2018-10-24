package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ProductOfArrayExceptSelfTest {
    ProductOfArrayExceptSelf sol = new ProductOfArrayExceptSelf();

    @Test
    public void test01() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] ans = new int[]{24, 12, 8, 6};
        int[] ret = sol.productExceptSelf(nums);
        Assertions.assertTrue(Arrays.equals(ans, ret));
    }

    @Test
    public void test02() {
        int[] nums = new int[]{0, 0};
        int[] ans = new int[]{0, 0};
        int[] ret = sol.productExceptSelf(nums);
        Assertions.assertTrue(Arrays.equals(ans, ret));
    }

    @Test
    public void test03() {
        int[] nums = new int[]{0, 1};
        int[] ans = new int[]{1, 0};
        int[] ret = sol.productExceptSelf(nums);
        Assertions.assertTrue(Arrays.equals(ans, ret));
    }

    @Test
    public void test04() {
        int[] nums = new int[]{0, 1, 0};
        int[] ans = new int[]{0, 0, 0};
        int[] ret = sol.productExceptSelf(nums);
        Assertions.assertTrue(Arrays.equals(ans, ret));
    }
}
