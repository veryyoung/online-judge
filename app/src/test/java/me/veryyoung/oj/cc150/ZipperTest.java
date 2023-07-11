package me.veryyoung.oj.cc150;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZipperTest {

    @Test
    public void testZipString() {
        Zipper zipper = new Zipper();
        assertEquals("a", zipper.zipString("a"));
        assertEquals("aa", zipper.zipString("aa"));
        assertEquals("a2b1c5a3", zipper.zipString("aabcccccaaa"));
        assertEquals("welcometonowcoderrrrr", zipper.zipString("welcometonowcoderrrrr"));
    }
}