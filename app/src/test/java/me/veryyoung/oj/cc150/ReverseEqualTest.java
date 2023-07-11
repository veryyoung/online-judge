package me.veryyoung.oj.cc150;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ReverseEqualTest {

    @Test
    public void testCheckReverseEqual() {
        ReverseEqual reverseEqual = new ReverseEqual();
        assertTrue(reverseEqual.checkReverseEqual("", ""));
        assertFalse(reverseEqual.checkReverseEqual("", " "));
        assertFalse(reverseEqual.checkReverseEqual("Hello world", "worldhello "));
        assertTrue(reverseEqual.checkReverseEqual("waterbottle", "erbottlewat"));
    }
}