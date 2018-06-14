import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class ContainerWithMostWaterTest {
    @Test
    public void test01() {
        int[] height = new int[]{1, 1};
        ContainerWithMostWater container = new ContainerWithMostWater();
        int area = container.maxArea(height);
        Assertions.assertEquals(1, area);
    }

    @Test
    public void test02() {
        int[] height = new int[]{1, 2, 5, 10, 3, 9, 4, 6, 8};
        ContainerWithMostWater container = new ContainerWithMostWater();
        int area = container.maxArea(height);
        Assertions.assertEquals(40, area);
    }

    @Test
    public void test03() {
        Random rand = new Random();
        int[] height = new int[1000];
        for (int i = 0; i < height.length; i++) {
            height[i] = rand.nextInt(1000) + 1;
        }
        ContainerWithMostWater container = new ContainerWithMostWater();
        int area = container.maxArea(height);
        int correctArea = container.maxAreaBruteForce(height);
        Assertions.assertEquals(correctArea, area);
    }
}