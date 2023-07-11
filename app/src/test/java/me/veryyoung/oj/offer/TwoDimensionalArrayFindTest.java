package me.veryyoung.oj.offer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoDimensionalArrayFindTest {

    @Test
    public void testFind() {
        assertEquals(true, new TwoDimensionalArrayFind().find(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}, 2));
        assertEquals(false, new TwoDimensionalArrayFind().find(new int[][]{}, 2));
    }
}