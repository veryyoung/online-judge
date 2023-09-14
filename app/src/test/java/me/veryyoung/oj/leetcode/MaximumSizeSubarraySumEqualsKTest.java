package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumSizeSubarraySumEqualsKTest {

    @Test
    public void testMaxSubArrayLen() {
        MaximumSizeSubarraySumEqualsK instance = new MaximumSizeSubarraySumEqualsK();
//        assertEquals(4, instance.maxSubArrayLen(new int[]{1, -1, 5, -2, 3}, 3));
//        assertEquals(2, instance.maxSubArrayLen(new int[]{-2, -1, 2, 1}, 1));
        assertEquals(1, instance.maxSubArrayLen(new int[]{-1}, -1));
    }

}
