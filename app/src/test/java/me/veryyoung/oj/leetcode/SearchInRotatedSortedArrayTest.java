package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void testSearch() {
        SearchInRotatedSortedArray instance = new SearchInRotatedSortedArray();
        assertEquals(4, instance.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(-1, instance.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        assertEquals(-1, instance.search(new int[]{1}, 0));
    }

}
