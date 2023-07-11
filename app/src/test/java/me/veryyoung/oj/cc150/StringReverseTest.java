package me.veryyoung.oj.cc150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverseTest {

    @Test
    public void testReverseString() {
        StringReverse stringReverse = new StringReverse();
        assertEquals(null, stringReverse.reverseString(null));
        assertEquals("", stringReverse.reverseString(""));
        assertEquals("a", stringReverse.reverseString("a"));
        assertEquals("aeiou", stringReverse.reverseString("uoiea"));
        assertEquals("redocwon si sihT", stringReverse.reverseString("This is nowcoder"));

    }
}