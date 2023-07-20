package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrappingRainWaterTest {

    @Test
    public void testTrap() {
        TrappingRainWater instance = new TrappingRainWater();
        assertEquals(6, instance.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, instance.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }

}
