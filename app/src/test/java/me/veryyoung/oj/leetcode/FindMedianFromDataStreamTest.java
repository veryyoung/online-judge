package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMedianFromDataStreamTest {

    @Test
    public void testMedianFinder() {
        FindMedianFromDataStream.MedianFinder instance0 = new FindMedianFromDataStream.MedianFinder();
        instance0.addNum(1);
        instance0.addNum(2);
        assertEquals(1.5f, instance0.findMedian(), 0);
        instance0.addNum(3);
        assertEquals(2.0f, instance0.findMedian(), 0);
    }

}
