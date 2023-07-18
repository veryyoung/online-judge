package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static me.veryyoung.oj.util.ArrayUtils.toArrayIgnoreOrder;
import static org.junit.Assert.assertArrayEquals;

public class CombinationsTest {

    @Test
    public void testCombine() {
        Combinations instance = new Combinations();
        assertArrayEquals(new int[][]{{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}}, toArrayIgnoreOrder(instance.combine(4, 2)));
        assertArrayEquals(new int[][]{{1, 2, 3}, {1, 2, 4}, {1, 3, 4}, {2, 3, 4}}, toArrayIgnoreOrder(instance.combine(4, 3)));
    }

}
