package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static me.veryyoung.oj.util.ArrayUtils.toArrayIgnoreOrder;
import static org.junit.Assert.assertArrayEquals;


public class ThreeSumTest {

    @Test
    public void testThreeSum() {
        ThreeSum instance = new ThreeSum();
        assertArrayEquals(new int[][]{{-1, -1, 2}, {-1, 0, 1}}, toArrayIgnoreOrder(instance.threeSum(new int[]{-1, 0, 1, 2, -1, -4})));
        assertArrayEquals(new int[][]{}, toArrayIgnoreOrder(instance.threeSum(new int[]{0, 1, 1})));
        assertArrayEquals(new int[][]{{0, 0, 0}}, toArrayIgnoreOrder(instance.threeSum(new int[]{0, 0, 0})));
    }

}
