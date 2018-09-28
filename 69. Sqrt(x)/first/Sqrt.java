package first;

public class Sqrt {
    public int mySqrt(int x) {
        int lo = 1, hi = x;
        int mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (mid == x / mid)
                return mid;
            if (mid > x / mid) {
                hi = mid - 1;
            } else
                lo = mid + 1;
        }
        return hi;
    }
}
