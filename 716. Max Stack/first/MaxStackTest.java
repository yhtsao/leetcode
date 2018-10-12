package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxStackTest {

    @Test
    public void test01() {
        MaxStack maxStack = new MaxStack();
        maxStack.push(5);
        maxStack.push(1);
        maxStack.push(5);
        Assertions.assertEquals(5, maxStack.top());
        Assertions.assertEquals(5, maxStack.popMax());
        Assertions.assertEquals(1, maxStack.top());
        Assertions.assertEquals(5, maxStack.peekMax());
        Assertions.assertEquals(1, maxStack.pop());
        Assertions.assertEquals(5, maxStack.top());
        Assertions.assertEquals(5, maxStack.popMax());
    }

    @Test
    public void test02() {
        MaxStack maxStack = new MaxStack();
        maxStack.push(2);
        maxStack.push(1);
        maxStack.push(5);
        maxStack.push(3);
        Assertions.assertEquals(3, maxStack.top());
        Assertions.assertEquals(5, maxStack.peekMax());
        maxStack.push(9);
        Assertions.assertEquals(9, maxStack.peekMax());
        Assertions.assertEquals(9, maxStack.top());
        Assertions.assertEquals(9, maxStack.pop());

        Assertions.assertEquals(5, maxStack.peekMax());
        Assertions.assertEquals(3, maxStack.top());
        Assertions.assertEquals(5, maxStack.popMax());

        Assertions.assertEquals(3, maxStack.top());
        Assertions.assertEquals(3, maxStack.peekMax());
    }
}
