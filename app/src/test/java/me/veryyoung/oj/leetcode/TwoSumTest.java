package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {


    @Test
    public void testTwoSum() {
        TwoSum instance = new TwoSum();
        assertArrayEquals(new int[]{1, 2}, instance.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, instance.twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, instance.twoSum(new int[]{3, 3}, 6));
    }
}
