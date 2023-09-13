package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CanIWinTest {

    @Test
    public void testCanIWin() {
        CanIWin instance = new CanIWin();
        assertEquals(false, instance.canIWin(10, 11));
        assertEquals(true, instance.canIWin(10, 0));
        assertEquals(true, instance.canIWin(10, 1));
        assertEquals(false, instance.canIWin(20, 152));
    }

}
