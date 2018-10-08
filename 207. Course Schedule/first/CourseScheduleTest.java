package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseScheduleTest {
    private CourseSchedule sol = new CourseSchedule();

    @Test
    public void test01() {
        int numCourses = 2;
        int[][] prerequisties = new int[][]{
                {1, 0}
        };
        boolean res = sol.canFinish(numCourses, prerequisties);
        Assertions.assertTrue(res);
    }

    @Test
    public void test02() {
        int numCourses = 2;
        int[][] prerequisties = new int[][]{
                {1, 0},
                {0, 1}
        };
        boolean res = sol.canFinish(numCourses, prerequisties);
        Assertions.assertFalse(res);
    }

    @Test
    public void test03() {
        int numCourses = 3;
        int[][] prerequisties = new int[][]{
                {1, 0},
                {0, 2},
                {2, 1}
        };
        boolean res = sol.canFinish(numCourses, prerequisties);
        Assertions.assertFalse(res);
    }

    @Test
    public void test04() {
        int numCourses = 3;
        int[][] prerequisties = new int[][]{
                {1, 0},
                {0, 2}
        };
        boolean res = sol.canFinish(numCourses, prerequisties);
        Assertions.assertTrue(res);
    }

    @Test
    public void test05() {
        int numCourses = 3;
        int[][] prerequisties = new int[][]{
                {1, 2},
                {0, 2}
        };
        boolean res = sol.canFinish(numCourses, prerequisties);
        Assertions.assertTrue(res);
    }
}
