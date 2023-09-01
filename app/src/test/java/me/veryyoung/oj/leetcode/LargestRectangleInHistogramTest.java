package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestRectangleInHistogramTest {

    @Test
    public void testLargestRectangleArea() {
        LargestRectangleInHistogram instance = new LargestRectangleInHistogram();
        assertEquals(10, instance.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        assertEquals(4, instance.largestRectangleArea(new int[]{2, 4}));
    }

}
