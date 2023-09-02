package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        BinarySearch instance = new BinarySearch();
        assertEquals(4, instance.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, instance.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        assertEquals(0, instance.search(new int[]{5}, 5));
    }
}
