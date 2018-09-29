package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FuncExclusiveTimeTest {
    private FuncExclusiveTime funcExclusiveTime = new FuncExclusiveTime();

    @Test
    public void test01() {
        int n = 2;
        List<String> logs = Arrays.asList(
                "0:start:0",
                "1:start:2",
                "1:end:5",
                "0:end:6");

        int[] ans = new int[]{3, 4};
        int[] res = funcExclusiveTime.exclusiveTime(n, logs);
        Assertions.assertTrue(Arrays.equals(ans, res));
    }

    @Test
    public void test02() {
        int n = 2;
        List<String> logs = Arrays.asList(
                "0:start:0",
                "0:start:2",
                "0:end:5",
                "1:start:7",
                "1:end:7",
                "0:end:8");

        int[] ans = new int[]{8, 1};
        int[] res = funcExclusiveTime.exclusiveTime(n, logs);
        Assertions.assertTrue(Arrays.equals(ans, res));
    }

    @Test
    public void test03() {
        int n = 2;
        List<String> logs = Arrays.asList(
                "0:start:0",
                "0:end:0",
                "1:start:1",
                "1:end:1",
                "0:start:2",
                "0:end:2");

        int[] ans = new int[]{2, 1};
        int[] res = funcExclusiveTime.exclusiveTime(n, logs);
        Assertions.assertTrue(Arrays.equals(ans, res));
    }
}
