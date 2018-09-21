package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameTest {
    @Test
    public void test01() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        JumpGame jumpGame = new JumpGame();
        boolean canJump = jumpGame.canJump(nums);
        Assertions.assertEquals(true, canJump);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{3, 2, 1, 0, 4};
        JumpGame jumpGame = new JumpGame();
        boolean canJump = jumpGame.canJump(nums);
        Assertions.assertEquals(false, canJump);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{2, 0, 1, 3};
        JumpGame jumpGame = new JumpGame();
        boolean canJump = jumpGame.canJump(nums);
        Assertions.assertEquals(true, canJump);
    }

    @Test
    public void test04() {
        int[] nums = new int[]{0, 0, 1, 3};
        JumpGame jumpGame = new JumpGame();
        boolean canJump = jumpGame.canJump(nums);
        Assertions.assertEquals(false, canJump);
    }
}
