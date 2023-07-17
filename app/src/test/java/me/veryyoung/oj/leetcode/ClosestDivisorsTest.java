package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ClosestDivisorsTest {

    @Test
    public void testClosestDivisors() {
        ClosestDivisors instance = new ClosestDivisors();
        assertArrayEquals(new int[]{3, 3}, instance.closestDivisors(8));
        assertArrayEquals(new int[]{5, 25}, instance.closestDivisors(123));
        assertArrayEquals(new int[]{25, 40}, instance.closestDivisors(999));
    }
}
