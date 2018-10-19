package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindCelebrityTest {

    @Test
    public void test01() {
        int[][] relation = new int[][]{
                {1, 1},
                {0, 1}
        };
        FindCelebrity sol = new FindCelebrity(relation);
        int ans = 1;
        int ret = sol.findCelebrity(relation.length);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test02() {
        int[][] relation = new int[][]{
                {1, 0, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {0, 0, 1, 1, 1},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 1, 1}
        };
        FindCelebrity sol = new FindCelebrity(relation);
        int ans = 3;
        int ret = sol.findCelebrity(relation.length);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test03() {
        int[][] relation = new int[][]{
                {1, 0, 0, 1, 0, 1},
                {0, 1, 1, 0, 0, 0},
                {1, 1, 1, 0, 0, 1},
                {1, 1, 0, 1, 0, 1},
                {0, 1, 0, 0, 1, 0},
                {1, 1, 1, 0, 0, 1}
        };
        FindCelebrity sol = new FindCelebrity(relation);
        int ans = -1;
        int ret = sol.findCelebrity(relation.length);
        Assertions.assertEquals(ans, ret);
    }

    @Test
    public void test04() {
        int[][] relation = new int[][]{
                {1, 1, 0},
                {1, 1, 1},
                {0, 0, 0}
        };
        FindCelebrity sol = new FindCelebrity(relation);
        int ans = -1;
        int ret = sol.findCelebrity(relation.length);
        Assertions.assertEquals(ans, ret);
    }
}
