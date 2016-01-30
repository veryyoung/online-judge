package me.veryyoung.oj.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by veryyoung on 2016/1/29.
 */
public class TwoSumTest {


    @Test
    public void testTwoSum() {
        int[] result = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertArrayEquals(result, new int[]{1, 2});
    }
}
