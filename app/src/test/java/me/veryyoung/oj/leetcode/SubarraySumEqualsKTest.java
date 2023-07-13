package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubarraySumEqualsKTest {

    @Test
    public void testSubarraySum() {
        SubarraySumEqualsK instance = new SubarraySumEqualsK();
//        assertEquals(2, instance.subarraySum(new int[]{1, 1, 1}, 2));
//        assertEquals(2, instance.subarraySum(new int[]{1, 2, 3}, 3));
        assertEquals(2, instance.subarraySum(new int[]{1, 2, 3, 4, 5}, 5));
    }
}
