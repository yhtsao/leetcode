package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LFUCacheTest {
    @Test
    public void test01() {
        LFUCache cache = new LFUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        Assertions.assertEquals(1, cache.get(1));
        Assertions.assertEquals(1, cache.get(1));
        Assertions.assertEquals(2, cache.get(2));
        cache.put(3, 3);
        Assertions.assertEquals(-1, cache.get(2));
        Assertions.assertEquals(3, cache.get(3));
        cache.put(4, 4);
        Assertions.assertEquals(-1, cache.get(3));
        Assertions.assertEquals(1, cache.get(1));
        Assertions.assertEquals(4, cache.get(4));
    }

    @Test
    public void test02() {
        LFUCache cache = new LFUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        Assertions.assertEquals(1, cache.get(1));
        Assertions.assertEquals(1, cache.get(1));
        Assertions.assertEquals(2, cache.get(2));
        cache.put(2, 21);
        cache.put(2, 22);
        cache.put(3, 3);
        Assertions.assertEquals(-1, cache.get(1));
        Assertions.assertEquals(22, cache.get(2));
        Assertions.assertEquals(3, cache.get(3));
        cache.put(4, 4);
        Assertions.assertEquals(-1, cache.get(3));
        Assertions.assertEquals(22, cache.get(2));
        Assertions.assertEquals(4, cache.get(4));
    }
}
