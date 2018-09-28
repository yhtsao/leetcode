package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PlusOneTest {
    private PlusOne plusOne = new PlusOne();

    @Test
    public void test01() {
        int[] digits = new int[]{1, 2, 3};
        int[] ans = new int[]{1, 2, 4};
        int[] result = plusOne.plusOne(digits);
        Assertions.assertTrue(Arrays.equals(ans, result));
    }

    @Test
    public void test02() {
        int[] digits = new int[]{9, 9};
        int[] ans = new int[]{1, 0, 0};
        int[] result = plusOne.plusOne(digits);
        Assertions.assertTrue(Arrays.equals(ans, result));
    }

    @Test
    public void test03() {
        int[] digits = new int[]{9};
        int[] ans = new int[]{1, 0};
        int[] result = plusOne.plusOne(digits);
        Assertions.assertTrue(Arrays.equals(ans, result));
    }

    @Test
    public void test04() {
        int[] digits = new int[]{2, 1, 4, 7, 4, 8, 3, 6, 4, 7};
        int[] ans = new int[]{2, 1, 4, 7, 4, 8, 3, 6, 4, 8};
        int[] result = plusOne.plusOne(digits);
        Assertions.assertTrue(Arrays.equals(ans, result));
    }

    @Test
    public void test05() {
        int[] digits = new int[]{2, 1, 4, 7, 4, 8, 3, 6, 4, 7};
        int[] ans = new int[]{2, 1, 4, 7, 4, 8, 3, 6, 4, 8};
        int[] result = plusOne.plusOne(digits);
        Assertions.assertTrue(Arrays.equals(ans, result));
    }
}
