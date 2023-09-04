package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KokoEatingBananasTest {

    @Test
    public void testMinEatingSpeed() {
        KokoEatingBananas instance = new KokoEatingBananas();
        assertEquals(4, instance.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        assertEquals(30, instance.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        assertEquals(23, instance.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
    }

}
