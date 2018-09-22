package first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SkylineProblemTest {
    private SkylineProblem skylineProblem = new SkylineProblem();

    @Test
    public void test01() {
        int[][] building = new int[][]
                {
                        {2, 9, 10},
                        {3, 7, 15},
                        {5, 12, 12},
                        {15, 20, 10},
                        {19, 24, 8}
                };

        List<int[]> ans = Arrays.asList(
                new int[]{2, 10},
                new int[]{3, 15},
                new int[]{7, 12},
                new int[]{12, 0},
                new int[]{15, 10},
                new int[]{20, 8},
                new int[]{24, 0}
        );

        List<int[]> results = skylineProblem.getSkyline(building);

        Assertions.assertEquals(ans.size(), ans.size());
        for (int i = 0; i < ans.size(); i++)
            Assertions.assertTrue(Arrays.equals(ans.get(i), results.get(i)));
    }

    @Test
    public void test02() {
        int[][] building = new int[][]
                {
                        {2, 9, 10},
                        {3, 7, 5},
                        {5, 12, 12}
                };

        List<int[]> ans = Arrays.asList(
                new int[]{2, 10},
                new int[]{5, 12},
                new int[]{12, 0}
        );

        List<int[]> results = skylineProblem.getSkyline(building);

        Assertions.assertEquals(ans.size(), ans.size());
        for (int i = 0; i < ans.size(); i++)
            Assertions.assertTrue(Arrays.equals(ans.get(i), results.get(i)));
    }

    @Test
    public void test03() {
        int[][] building = new int[][]
                {
                        {1, 3, 2},
                        {1, 4, 4},
                        {5, 8, 4},
                        {7, 8, 2},
                        {9, 12, 4},
                        {10, 11, 2}
                };

        List<int[]> ans = Arrays.asList(
                new int[]{1, 4},
                new int[]{4, 0},
                new int[]{5, 4},
                new int[]{8, 0},
                new int[]{9, 4},
                new int[]{12, 0}
        );

        List<int[]> results = skylineProblem.getSkyline(building);

        Assertions.assertEquals(ans.size(), ans.size());
        for (int i = 0; i < ans.size(); i++)
            Assertions.assertTrue(Arrays.equals(ans.get(i), results.get(i)));
    }

    @Test
    public void test04() {
        int[][] building = new int[][]
                {
                        {1, 3, 2},
                        {1, 4, 4},
                        {4, 5, 2},
                        {5, 8, 4},
                        {7, 8, 2}
                };

        List<int[]> ans = Arrays.asList(
                new int[]{1, 4},
                new int[]{4, 2},
                new int[]{5, 4},
                new int[]{8, 0}
        );

        List<int[]> results = skylineProblem.getSkyline(building);

        Assertions.assertEquals(ans.size(), ans.size());
        for (int i = 0; i < ans.size(); i++)
            Assertions.assertTrue(Arrays.equals(ans.get(i), results.get(i)));
    }

    @Test
    public void test05() {
        int[][] building = new int[][]
                {
                        {0, 2, 3},
                        {2, 5, 3}
                };

        List<int[]> ans = Arrays.asList(
                new int[]{0, 3},
                new int[]{5, 0}
        );

        List<int[]> results = skylineProblem.getSkyline(building);

        Assertions.assertEquals(ans.size(), ans.size());
        for (int i = 0; i < ans.size(); i++)
            Assertions.assertTrue(Arrays.equals(ans.get(i), results.get(i)));
    }
}