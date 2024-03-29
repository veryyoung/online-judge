package me.veryyoung.oj.cc150;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ClearerTest {

    @Test
    public void testClearZero() {
        Clearer clearer = new Clearer();
        assertArrayEquals(new int[][]{{1}}, clearer.clearZero(new int[][]{{1}}, 1));
        assertArrayEquals(new int[][]{{0}}, clearer.clearZero(new int[][]{{0}}, 1));
        assertArrayEquals(new int[][]{{0, 0, 3}, {0, 0, 0}, {0, 0, 0}},
                clearer.clearZero(new int[][]{{1, 2, 3}, {0, 1, 2}, {0, 0, 1}}, 3));
    }
}