package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainerWithMostWaterTest {

    @Test
    public void testMaxArea() {
        ContainerWithMostWater instance = new ContainerWithMostWater();
        assertEquals(49, instance.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        assertEquals(1, instance.maxArea(new int[]{1, 1}));
    }

}
