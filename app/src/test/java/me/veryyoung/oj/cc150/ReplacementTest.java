package me.veryyoung.oj.cc150;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReplacementTest {

    @Test
    public void testReplaceSpace() {
        Replacement replacement = new Replacement();
        assertEquals("Mr%20John%20Smith", replacement.replaceSpace("Mr John Smith", 13));
        assertEquals("Hello%20%20World", replacement.replaceSpace("Hello  World", 12));
    }
}