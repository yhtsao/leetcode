package first;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskSchedulerTest {
    private TaskScheduler taskScheduler = new TaskScheduler();

    @Test
    public void test01() {
        char[] tasks = new char[]{'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        int ans = 8;
        int result = taskScheduler.leastInterval(tasks, n);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test02() {
        char[] tasks = new char[]{'A', 'A', 'A', 'C', 'B', 'B', 'A', 'D', 'B'};
        int n = 2;
        int ans = 10;
        int result = taskScheduler.leastInterval(tasks, n);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void test03() {
        char[] tasks = new char[]{'A', 'A', 'A',
                'B', 'B', 'B',
                'C', 'C', 'C',
                'D', 'D', 'D',
        };
        int n = 2;
        int ans = 12;
        int result = taskScheduler.leastInterval(tasks, n);
        Assertions.assertEquals(ans, result);
    }
}
