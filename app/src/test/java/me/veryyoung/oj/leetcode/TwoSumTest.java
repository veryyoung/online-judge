package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {


    @Test
    public void testTwoSum() {
        int[] result = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(result, new int[]{1, 2});
    }
}
