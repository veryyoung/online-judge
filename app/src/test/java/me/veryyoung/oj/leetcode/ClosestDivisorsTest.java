package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ClosestDivisorsTest {

    @Test
    public void testClosestDivisors() {
        ClosestDivisors instance = new ClosestDivisors();
        assertArrayEquals(instance.closestDivisors(8), new int[]{3, 3});
        assertArrayEquals(instance.closestDivisors(123), new int[]{5, 25});
        assertArrayEquals(instance.closestDivisors(999), new int[]{25, 40});

    }
}
