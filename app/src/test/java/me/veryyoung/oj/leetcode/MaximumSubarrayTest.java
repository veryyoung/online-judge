package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSubarrayTest {

    @Test
    public void testMaxSubArray() {
        MaximumSubarray instance = new MaximumSubarray();
        assertEquals(6, instance.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, instance.maxSubArray(new int[]{1}));
        assertEquals(23, instance.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }

}
