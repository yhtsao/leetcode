import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JumpGameIITest {
    @Test
    public void test01() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        JumpGameII jumpGameII = new JumpGameII();
        int minJump = jumpGameII.jump(nums);
        Assertions.assertEquals(2, minJump);
    }

    @Test
    public void test02() {
        int[] nums = new int[]{2, 2, 4, 0, 0, 5};
        JumpGameII jumpGameII = new JumpGameII();
        int minJump = jumpGameII.jump(nums);
        Assertions.assertEquals(2, minJump);
    }

    @Test
    public void test03() {
        int[] nums = new int[]{0};
        JumpGameII jumpGameII = new JumpGameII();
        int minJump = jumpGameII.jump(nums);
        Assertions.assertEquals(0, minJump);
    }

    @Test
    public void test04() {
        int[] nums = new int[]{1, 0};
        JumpGameII jumpGameII = new JumpGameII();
        int minJump = jumpGameII.jump(nums);
        Assertions.assertEquals(1, minJump);
    }

    @Test
    public void test05() {
        int[] nums = new int[]{1, 1, 1, 1};
        JumpGameII jumpGameII = new JumpGameII();
        int minJump = jumpGameII.jump(nums);
        Assertions.assertEquals(3, minJump);
    }
}
