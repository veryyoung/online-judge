package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class DailyTemperaturesTest {

    @Test
    public void testDailyTemperatures() {
        DailyTemperatures instance = new DailyTemperatures();
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                instance.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
        assertArrayEquals(new int[]{1, 1, 1, 0}, instance.dailyTemperatures(new int[]{30, 40, 50, 60}));
        assertArrayEquals(new int[]{1, 1, 0}, instance.dailyTemperatures(new int[]{30, 60, 90}));
    }

}
