package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    @Test
    public void test01() {
        MyQueue queue = new MyQueue();
        Assertions.assertTrue(queue.empty());
        queue.push(10);
        Assertions.assertEquals(10, queue.peek());
        queue.push(12);
        Assertions.assertEquals(10, queue.peek());
        queue.push(3);
        Assertions.assertEquals(10, queue.peek());
        Assertions.assertEquals(10, queue.pop());
        Assertions.assertEquals(12, queue.pop());
        Assertions.assertFalse(queue.empty());
        Assertions.assertEquals(3, queue.pop());
        Assertions.assertTrue(queue.empty());
    }
}
