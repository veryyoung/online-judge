package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TopKFrequentElementsTest {

    @Test
    public void testTopKFrequent() {
        TopKFrequentElements instance = new TopKFrequentElements();
        assertArrayEquals(new int[]{1, 2}, instance.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
        assertArrayEquals(new int[]{1}, instance.topKFrequent(new int[]{1}, 1));
        assertArrayEquals(new int[]{-1}, instance.topKFrequent(new int[]{-1, -1}, 1));
    }

}
