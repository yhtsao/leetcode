package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilpStrToMonotoneIncreaseTest {
    FilpStrToMonotoneIncrease sol = new FilpStrToMonotoneIncrease();

    @Test
    public void test02() {
        String s;
        int ans;

        s = "00110";
        ans = 1;
        Assertions.assertEquals(ans, sol.minFlipsMonoIncr(s));

        s = "010110";
        ans = 2;
        Assertions.assertEquals(ans, sol.minFlipsMonoIncr(s));

        s = "00011000";
        ans = 2;
        Assertions.assertEquals(ans, sol.minFlipsMonoIncr(s));

        s = "10000010";
        ans = 2;
        Assertions.assertEquals(ans, sol.minFlipsMonoIncr(s));

        s = "0101100011";
        ans = 3;
        Assertions.assertEquals(ans, sol.minFlipsMonoIncr(s));

        s = "10011111110010111011";
        ans = 5;
        Assertions.assertEquals(ans, sol.minFlipsMonoIncr(s));
    }
}
