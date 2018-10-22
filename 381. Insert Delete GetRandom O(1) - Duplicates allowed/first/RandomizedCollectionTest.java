package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomizedCollectionTest {

    @Test
    public void test01() {
        RandomizedCollection collection = new RandomizedCollection();
        Assertions.assertTrue(collection.insert(1));
        Assertions.assertFalse(collection.insert(1));
        Assertions.assertTrue(collection.insert(2));
        Assertions.assertFalse(collection.insert(1));
        Assertions.assertFalse(collection.insert(2));
        for (int i = 0; i < 15; i++)
            System.out.print(collection.getRandom() + ", ");
        Assertions.assertTrue(collection.remove(1));
        Assertions.assertFalse(collection.remove(10));
        Assertions.assertTrue(collection.remove(1));
        Assertions.assertTrue(collection.remove(1));
        Assertions.assertFalse(collection.remove(1));
        Assertions.assertTrue(collection.insert(1));
        Assertions.assertFalse(collection.insert(1));
        System.out.println("");
        for (int i = 0; i < 10; i++)
            System.out.print(collection.getRandom() + ", ");
    }

    @Test
    public void test02() {
        RandomizedCollection sol = new RandomizedCollection();
        Assertions.assertTrue(sol.insert(4));
        Assertions.assertTrue(sol.insert(3));
        Assertions.assertFalse(sol.insert(4));
        Assertions.assertTrue(sol.insert(2));
        Assertions.assertFalse(sol.insert(4));

        Assertions.assertTrue(sol.remove(4));
        Assertions.assertTrue(sol.remove(3));
        Assertions.assertTrue(sol.remove(4));
        Assertions.assertTrue(sol.remove(4));
    }
}
