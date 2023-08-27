package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static me.veryyoung.oj.util.ArrayUtils.toArray;
import static org.junit.Assert.assertArrayEquals;

public class FourSumTest {

    @Test
    public void testFourSum() {
        FourSum instance = new FourSum();
        assertArrayEquals(new int[][]{{-2, -1, 1, 2}, {-2, 0, 0, 2}, {-1, 0, 0, 1}},
                toArray(instance.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0)));
        assertArrayEquals(new int[][]{{2, 2, 2, 2}},
                toArray(instance.fourSum(new int[]{2, 2, 2, 2, 2}, 8)));
    }

}
