package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vector2DTest {

    @Test
    public void test01() {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3),
                Arrays.asList(4, 5, 6)
        );
        Vector2DIterator vector2D = new Vector2DIterator(list);
        Integer[] ans = new Integer[]{1, 2, 3, 4, 5, 6};
        List<Integer> ret = new ArrayList<>();
        vector2D.forEachRemaining(ret::add);
        for (int i = 0; i < ans.length; i++)
            Assertions.assertEquals(ans[i], ret.get(i));
    }

    @Test
    public void test02() {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                new ArrayList<>(),
                Arrays.asList(3),
                new ArrayList<>(),
                Arrays.asList(4, 5, 6),
                new ArrayList<>()
        );
        Vector2DIterator vector2D = new Vector2DIterator(list);
        Integer[] ans = new Integer[]{1, 2, 3, 4, 5, 6};
        List<Integer> ret = new ArrayList<>();
        vector2D.forEachRemaining(ret::add);
        for (int i = 0; i < ans.length; i++)
            Assertions.assertEquals(ans[i], ret.get(i));
    }
}
