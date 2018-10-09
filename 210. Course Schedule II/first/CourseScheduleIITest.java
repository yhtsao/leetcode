package first;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CourseScheduleIITest {
    private CourseScheduleII sol = new CourseScheduleII();

    @Test
    public void test01() {
        int numCourses = 2;
        int[][] prerequisties = new int[][]{
                {1, 0}
        };
        int[] res = sol.findOrder(numCourses, prerequisties);
        System.out.println(Arrays.toString(res));
    }

    @Test
    public void test02() {
        int numCourses = 4;
        int[][] prerequisties = new int[][]{
                {1, 0}, {2, 0}, {3, 1}, {3, 2}
        };
        int[] res = sol.findOrder(numCourses, prerequisties);
        System.out.println(Arrays.toString(res));
    }

    @Test
    public void test03() {
        int numCourses = 3;
        int[][] prerequisties = new int[][]{
                {1, 2},
                {0, 2}
        };
        int[] res = sol.findOrder(numCourses, prerequisties);
        System.out.println(Arrays.toString(res));
    }

    @Test
    public void test04() {
        int numCourses = 3;
        int[][] prerequisties = new int[][]{
                {1, 0},
                {0, 2},
                {2, 1}
        };
        int[] res = sol.findOrder(numCourses, prerequisties);
        System.out.println(Arrays.toString(res));
    }

    @Test
    public void test05() {
        int numCourses = 8;
        int[][] prerequisties = new int[][]{
                {2, 0},
                {3, 1},
                {4, 2},
                {4, 3},
                {5, 4},
                {6, 3},
                {6, 5},
                {7, 6},
        };
        int[] res = sol.findOrder(numCourses, prerequisties);
        System.out.println(Arrays.toString(res));
    }
}
