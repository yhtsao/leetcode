package first;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        return isPowerOfThreeMethod2(n);
    }

    private boolean isPowerOfThreeMethod1(int n) {
        // max value of power of 3 = 3 ^ 19
        int maxPowerOfThree = (int) Math.pow(3, (int) (Math.log(Integer.MAX_VALUE) / Math.log(3)));
        return n > 0 && maxPowerOfThree % n == 0;
    }

    private boolean isPowerOfThreeMethod2(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
