package first;

import first.MedianFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianFinderTest {
    @Test
    public void test01() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        Assertions.assertEquals(1, medianFinder.findMedian());

        medianFinder.addNum(2);
        Assertions.assertEquals(1.5, medianFinder.findMedian());

        medianFinder.addNum(100);
        Assertions.assertEquals(2, medianFinder.findMedian());

        medianFinder.addNum(50);
        Assertions.assertEquals(26, medianFinder.findMedian());
    }

    @Test
    public void test02() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(3);
        Assertions.assertEquals(3, medianFinder.findMedian());

        medianFinder.addNum(7);
        Assertions.assertEquals(5, medianFinder.findMedian());

        medianFinder.addNum(6);
        Assertions.assertEquals(6, medianFinder.findMedian());

        medianFinder.addNum(4);
        Assertions.assertEquals(5, medianFinder.findMedian());

        medianFinder.addNum(1);
        Assertions.assertEquals(4, medianFinder.findMedian());

        medianFinder.addNum(2);
        Assertions.assertEquals(3.5, medianFinder.findMedian());

        medianFinder.addNum(5);
        Assertions.assertEquals(4, medianFinder.findMedian());

        medianFinder.addNum(8);
        Assertions.assertEquals(4.5, medianFinder.findMedian());
    }
}
