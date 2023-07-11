package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HammingDistanceTest {

    @Test
    public void testCheckReverseEqual() {
        HammingDistance instance = new HammingDistance();
        assertEquals("0", instance.decimalToBinary(0));
        assertEquals("1", instance.decimalToBinary(1));
        assertEquals("10", instance.decimalToBinary(2));
        assertEquals("1011", instance.decimalToBinary(11));
        assertEquals(2, instance.hammingDistance(1, 4));
        assertEquals(2, instance.hammingDistance(0, 10));
    }
}