package me.veryyoung.oj.cc150;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringDifferentTest {

    @Test
    public void testCheckDifferent() {
        StringDifferent stringDifferent = new StringDifferent();
        assertEquals(false, stringDifferent.checkDifferent("BarackObama"));
        assertEquals(true, stringDifferent.checkDifferent("aeiou"));
    }
}