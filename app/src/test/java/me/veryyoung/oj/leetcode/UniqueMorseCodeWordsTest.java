package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueMorseCodeWordsTest {

    @Test
    public void testClearZero() {
        UniqueMorseCodeWords instance = new UniqueMorseCodeWords();
        assertEquals(2, instance.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
        assertEquals(1, instance.uniqueMorseRepresentations(new String[]{"a"}));
    }
}