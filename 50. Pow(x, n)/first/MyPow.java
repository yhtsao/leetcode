package first;

public class MyPow {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;

        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        if (n % 2 == 0) {
            return (n < 0) ? myPow(x * x, -(n / 2)) : myPow(x * x, n / 2);
        }
        return x * myPow(x * x, n / 2);
    }
}
