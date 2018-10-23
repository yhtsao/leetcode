package first;

import common.NestedInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedIteratorTest {
    @Test
    public void test01() {
        NestedIterator sol = new NestedIterator(Arrays.asList(
                NestedInteger.deserialize("[23,-5]"),
                NestedInteger.deserialize("5"),
                NestedInteger.deserialize("[[122,98],7,34,[5]")
        ));
        int[] ans = new int[]{23, -5, 5, 122, 98, 7, 34, 5};
        List<Integer> ret = new ArrayList<>();
        sol.forEachRemaining(ret::add);
        for (int i = 0; i < ans.length; i++) {
            Assertions.assertEquals(ans[i], (int) ret.get(i));
        }
    }

    @Test
    public void test02() {
        NestedIterator sol = new NestedIterator(Arrays.asList(
                NestedInteger.deserialize("[]")
        ));
        Assertions.assertFalse(sol.hasNext());
    }
}
