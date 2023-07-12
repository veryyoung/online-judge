package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountPairsTest {

    @Test
    public void testCountPairs() {
        CountPairs instance = new CountPairs();
        assertEquals(14, instance.countPairs(7, new int[][]{{0, 2}, {0, 5}, {2, 4}, {1, 6}, {5, 4}}));
        assertEquals(0, instance.countPairs(3, new int[][]{{0, 1}, {0, 2}, {1, 2}}));
        assertEquals(66, instance.countPairs(12, new int[][]{}));
        assertEquals(4999950000l, instance.countPairs(100000, new int[][]{}));
        assertEquals(61, instance.countPairs(12, new int[][]{{2, 6}, {11, 3}, {5, 4}, {6, 9}}));


    }
}
