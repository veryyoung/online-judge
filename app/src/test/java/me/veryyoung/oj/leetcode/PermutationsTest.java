package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static me.veryyoung.oj.util.ArrayUtils.toArray;
import static org.junit.Assert.assertArrayEquals;

public class PermutationsTest {

    @Test
    public void testCombine() {
        Permutations instance = new Permutations();
        assertArrayEquals(new int[][]{{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}},
                toArray(instance.permute(new int[]{1, 2, 3})));
        assertArrayEquals(new int[][]{{0, 1}, {1, 0}}, toArray(instance.permute(new int[]{0, 1})));
        assertArrayEquals(new int[][]{{1}}, toArray(instance.permute(new int[]{1})));
    }

}
