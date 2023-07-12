package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountPrimesTest {

    @Test
    public void testCountPrimes() {
        CountPrimes instance = new CountPrimes();
        assertEquals(4, instance.countPrimes(10));
        assertEquals(0, instance.countPrimes(0));
        assertEquals(0, instance.countPrimes(1));
        assertEquals(0, instance.countPrimes(2));
        assertEquals(1, instance.countPrimes(3));
        assertEquals(2, instance.countPrimes(4));
        assertEquals(3, instance.countPrimes(6));
    }
}
