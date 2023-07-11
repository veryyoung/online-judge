package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JewelsAndStonesTest {

    @Test
    public void testClearZero() {
        JewelsAndStones instance = new JewelsAndStones();
        assertEquals(3, instance.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, instance.numJewelsInStones("z", "ZZ"));
    }
}