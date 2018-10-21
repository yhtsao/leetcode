package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongPressNameTest {
    private LongPressName sol = new LongPressName();

    @Test
    public void test01() {

        String name, typed;

        name = "alex";
        typed = "aaleex";
        Assertions.assertTrue(sol.isLongPressedName(name, typed));

        name = "saeed";
        typed = "ssaaedd";
        Assertions.assertFalse(sol.isLongPressedName(name, typed));

        name = "a";
        typed = "aaa";
        Assertions.assertTrue(sol.isLongPressedName(name, typed));

        name = "a";
        typed = "a";
        Assertions.assertTrue(sol.isLongPressedName(name, typed));
    }
}
