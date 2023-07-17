package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestElementInAnArrayTest {

    @Test
    public void testFindKthLargest() {
        KthLargestElementInAnArray instance = new KthLargestElementInAnArray();
        assertEquals(5, instance.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        assertEquals(4, instance.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
        assertEquals(1, instance.findKthLargest(new int[]{1}, 1));
    }
}
