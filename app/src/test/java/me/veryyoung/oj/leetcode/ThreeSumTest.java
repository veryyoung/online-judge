package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static me.veryyoung.oj.util.ArrayUtils.toArray;
import static org.junit.Assert.assertArrayEquals;


public class ThreeSumTest {

    @Test
    public void testThreeSum() {
        ThreeSum instance = new ThreeSum();
        assertArrayEquals(new int[][]{{-1, -1, 2}, {-1, 0, 1}}, toArray(instance.threeSum(new int[]{-1, 0, 1, 2, -1, -4})));
        assertArrayEquals(new int[][]{}, toArray(instance.threeSum(new int[]{0, 1, 1})));
        assertArrayEquals(new int[][]{{0, 0, 0}}, toArray(instance.threeSum(new int[]{0, 0, 0})));
    }

}
