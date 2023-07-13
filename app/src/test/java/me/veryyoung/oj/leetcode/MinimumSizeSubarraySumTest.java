package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSizeSubarraySumTest {

    @Test
    public void testCountPairs() {
        MinimumSizeSubarraySum instance = new MinimumSizeSubarraySum();
        assertEquals(2, instance.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        assertEquals(1, instance.minSubArrayLen(4, new int[]{1, 4, 4}));
        assertEquals(0, instance.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals(1, instance.minSubArrayLen(7, new int[]{1, 1, 1, 1, 7}));

    }
}
