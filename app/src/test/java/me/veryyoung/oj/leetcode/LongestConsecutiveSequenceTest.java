package me.veryyoung.oj.leetcode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class LongestConsecutiveSequenceTest {

    @Test
    public void testClearZero() {
        LongestConsecutiveSequence instance = new LongestConsecutiveSequence();
        assertEquals(4, instance.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        assertEquals(1, instance.longestConsecutive(new int[]{0}));
    }
}