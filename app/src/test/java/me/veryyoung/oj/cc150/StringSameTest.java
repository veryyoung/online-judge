package me.veryyoung.oj.cc150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringSameTest {

    @Test
    public void testCheckSam() {
        StringSame stringSame = new StringSame();
        assertEquals(true, stringSame.checkSam(null, null));
        assertEquals(false, stringSame.checkSam("", null));
        assertEquals(false, stringSame.checkSam(null, "test"));
        assertEquals(true, stringSame.checkSam("", ""));
        assertEquals(false, stringSame.checkSam("", "test"));
        assertEquals(true, stringSame.checkSam("This is nowcoder", "is This nowcoder"));
        assertEquals(false, stringSame.checkSam("Here you are", "Are you here"));
    }
}