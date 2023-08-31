package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarFleetTest {

    @Test
    public void testCarFleet() {
        CarFleet instance = new CarFleet();
        assertEquals(3, instance.carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}));
        assertEquals(1, instance.carFleet(10, new int[]{3}, new int[]{3}));
        assertEquals(1, instance.carFleet(100, new int[]{0, 2, 4}, new int[]{4, 2, 1}));
    }

}
