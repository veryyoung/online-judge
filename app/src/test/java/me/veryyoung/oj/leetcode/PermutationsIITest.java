package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static me.veryyoung.oj.util.ArrayUtils.toArray;
import static org.junit.Assert.assertArrayEquals;

public class PermutationsIITest {

    @Test
    public void testPermuteUnique() {
        PermutationsII instance = new PermutationsII();
        assertArrayEquals(new int[][]{{1, 1, 2}, {1, 2, 1}, {2, 1, 1}},
                toArray(instance.permuteUnique(new int[]{1, 1, 2})));
        assertArrayEquals(new int[][]{{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}},
                toArray(instance.permuteUnique(new int[]{1, 2, 3})));
        assertArrayEquals(new int[][]{{1}}, toArray(instance.permuteUnique(new int[]{1})));
    }

}
