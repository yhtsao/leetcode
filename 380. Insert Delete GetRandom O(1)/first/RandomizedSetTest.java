package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomizedSetTest {
    @Test
    public void test01() {
        RandomizedSet randomSet = new RandomizedSet();
        Assertions.assertTrue(randomSet.insert(1));
        Assertions.assertFalse(randomSet.remove(2));
        Assertions.assertFalse(randomSet.insert(1));
        Assertions.assertTrue(randomSet.insert(2));

        for (int i = 0; i < 10; i++) {
            System.out.println(randomSet.getRandom());
        }

        Assertions.assertTrue(randomSet.remove(1));
        Assertions.assertEquals(2, randomSet.getRandom());
        Assertions.assertFalse(randomSet.insert(2));
    }

    @Test
    public void test02() {
        RandomizedSet randomSet = new RandomizedSet();
        Assertions.assertTrue(randomSet.insert(1));
        Assertions.assertTrue(randomSet.insert(2));
        Assertions.assertTrue(randomSet.insert(3));
        Assertions.assertTrue(randomSet.insert(4));
        Assertions.assertTrue(randomSet.insert(5));
        Assertions.assertTrue(randomSet.remove(3));

        for (int i = 0; i < 16; i++) {
            System.out.print(randomSet.getRandom() + ", ");
        }
    }
}
