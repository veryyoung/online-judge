package me.veryyoung.oj.cc150;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yangxiongwei on 2016/2/2.
 */
public class TransformTest {

    @Test
    public void testTransformImage() {
        Transform transform = new Transform();
        Assert.assertArrayEquals(new int[][]{{1}}, transform.transformImage(new int[][]{{1}}, 1));
        Assert.assertArrayEquals(new int[][]{{3, 1}, {4, 2}}, transform.transformImage(new int[][]{{1, 2}, {3, 4}}, 2));
        Assert.assertArrayEquals(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}},
                transform.transformImage(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 3));
    }
}