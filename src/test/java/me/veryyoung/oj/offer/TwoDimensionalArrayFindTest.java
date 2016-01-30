package me.veryyoung.oj.offer;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by veryyoung on 2016/1/30.
 */
public class TwoDimensionalArrayFindTest {

    @Test
    public void testFind() {
        Assert.assertEquals(true, new TwoDimensionalArrayFind().find(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}, 2));
        Assert.assertEquals(false, new TwoDimensionalArrayFind().find(new int[][]{}, 2));
    }
}