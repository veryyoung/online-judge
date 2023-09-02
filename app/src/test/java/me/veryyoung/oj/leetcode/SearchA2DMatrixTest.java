package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchA2DMatrixTest {

    @Test
    public void testSearchMatrix() {
        SearchA2DMatrix instance = new SearchA2DMatrix();
        assertEquals(true, instance.searchMatrix(new int[][]{{1, 3, 5, 7},
                {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
        assertEquals(false, instance.searchMatrix(new int[][]{{1, 3, 5, 7},
                {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
    }

}
