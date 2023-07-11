package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class JudgeRouteCircleTest {

    @Test
    public void testClearZero() {
        JudgeRouteCircle instance = new JudgeRouteCircle();
        assertEquals(true, instance.judgeCircle("UD"));
        assertEquals(false, instance.judgeCircle("LL"));
        assertEquals(true, instance.judgeCircle("UDLR"));
    }
}