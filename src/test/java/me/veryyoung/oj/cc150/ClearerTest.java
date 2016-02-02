package me.veryyoung.oj.cc150;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by veryyoung on 2016/2/2.
 */
public class ClearerTest {

    @Test
    public void testClearZero() {
        Clearer clearer = new Clearer();
        Assert.assertArrayEquals(new int[][]{{1}}, clearer.clearZero(new int[][]{{1}}, 1));
        Assert.assertArrayEquals(new int[][]{{0}}, clearer.clearZero(new int[][]{{0}}, 1));
        Assert.assertArrayEquals(new int[][]{{0, 0, 3}, {0, 0, 0}, {0, 0, 0}},
                clearer.clearZero(new int[][]{{1, 2, 3}, {0, 1, 2}, {0, 0, 1}}, 3));
    }
}