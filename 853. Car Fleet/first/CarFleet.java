package first;

import java.util.Arrays;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] cars = new double[position.length][2]; // position, speed
        for (int i = 0; i < position.length; i++)
            cars[i] = new double[]{position[i], speed[i]};

        // sort the cars by postion
        Arrays.sort(cars, (double[] a, double[] b) -> (Double.compare(b[0], a[0])));

        double lastTime = -1;
        int carfleet = 0;
        for (int i = 0; i < cars.length; i++) {
            double time = (target - cars[i][0]) / cars[i][1];
            if (time > lastTime) {
                lastTime = time;
                carfleet++;
            }
        }
        return carfleet;
    }
}
