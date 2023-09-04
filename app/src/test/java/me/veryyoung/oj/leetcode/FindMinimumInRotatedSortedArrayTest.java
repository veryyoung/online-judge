package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinimumInRotatedSortedArrayTest {

    @Test
    public void testFindMin() {
        FindMinimumInRotatedSortedArray instance = new FindMinimumInRotatedSortedArray();
        assertEquals(1, instance.findMin(new int[]{3, 4, 5, 1, 2}));
        assertEquals(0, instance.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        assertEquals(11, instance.findMin(new int[]{11, 13, 15, 17}));
    }

}
