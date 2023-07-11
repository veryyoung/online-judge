package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PeakIndexInAMountainArrayTest {

    @Test
    public void testClearZero() {
        PeakIndexInAMountainArray instance = new PeakIndexInAMountainArray();
        assertEquals(1, instance.peakIndexInMountainArray(new int[]{0, 1, 0}));
        assertEquals(1, instance.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
    }
}