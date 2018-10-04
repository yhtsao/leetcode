package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LRUCacheTest {
    @Test
    public void test01() {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        Assertions.assertEquals(1, cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        Assertions.assertEquals(-1, cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        Assertions.assertEquals(-1, cache.get(1));       // returns -1 (not found)
        Assertions.assertEquals(3, cache.get(3));       // returns 3
        Assertions.assertEquals(4, cache.get(4));       // returns 4
    }

    @Test
    public void test02() {
        LRUCache cache = new LRUCache(3);

        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);
        Assertions.assertEquals(10, cache.get(1));
        cache.put(40, 40); // evict key 2
        Assertions.assertEquals(-1, cache.get(2));
        Assertions.assertEquals(10, cache.get(1));
    }

    @Test
    public void test03() {
        LRUCache cache = new LRUCache(3);

        cache.put(1, 10);
        cache.put(2, 20);
        cache.put(3, 30);
        Assertions.assertEquals(10, cache.get(1));
        cache.put(4, 40); // evict key 2
        cache.put(1, 15); // update value of key 1
        Assertions.assertEquals(-1, cache.get(2));
        Assertions.assertEquals(15, cache.get(1));
    }

    @Test
    public void test04() {
        LRUCache cache = new LRUCache(1);

        cache.put(1, 10);
        Assertions.assertEquals(10, cache.get(1));
        cache.put(1, 15);
        Assertions.assertEquals(15, cache.get(1));
        cache.put(2, 20);
        Assertions.assertEquals(-1, cache.get(1));
        Assertions.assertEquals(20, cache.get(2));
        cache.put(3, 30);
        Assertions.assertEquals(-1, cache.get(1));
        Assertions.assertEquals(-1, cache.get(2));
        Assertions.assertEquals(30, cache.get(3));
    }

    @Test
    public void test05() {
        LRUCache cache = new LRUCache(2);

        cache.put(2, 4);
        cache.put(2, 1);
        Assertions.assertEquals(1, cache.get(2));
        cache.put(1, 10);
        cache.put(4, 40);
        Assertions.assertEquals(-1, cache.get(2));
    }

    @Test
    public void test06() {
        LRUCache cache = new LRUCache(2);

        cache.put(2, 1);
        cache.put(3, 2);
        Assertions.assertEquals(2, cache.get(3));
        Assertions.assertEquals(1, cache.get(2));
        cache.put(4, 3); // evict key 3
        Assertions.assertEquals(1, cache.get(2));
        Assertions.assertEquals(-1, cache.get(3));
        Assertions.assertEquals(3, cache.get(4));
    }
}
