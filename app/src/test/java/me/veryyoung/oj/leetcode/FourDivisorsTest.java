package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FourDivisorsTest {

    @Test
    public void testSumFourDivisors() {
        FourDivisors instance = new FourDivisors();
//        assertEquals(32, instance.sumFourDivisors(new int[]{21, 4, 7}));
//        assertEquals(64, instance.sumFourDivisors(new int[]{21, 21}));
//        assertEquals(0, instance.sumFourDivisors(new int[]{1, 2, 3, 4, 5}));
//        assertEquals(45, instance.sumFourDivisors(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        assertEquals(10932, instance.sumFourDivisors(new int[]{7286, 18704, 70773, 8224, 91675}));
    }
}
