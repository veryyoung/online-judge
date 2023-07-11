package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToLowerCaseTest {

    @Test
    public void testClearZero() {
        assertEquals(97, 'a');
        assertEquals(122, 'z');
        assertEquals(65, 'A');
        assertEquals(90, 'Z');


        ToLowerCase instance = new ToLowerCase();
        assertEquals("hello", instance.toLowerCase("Hello"));
        assertEquals("here", instance.toLowerCase("here"));
        assertEquals("lovely", instance.toLowerCase("LOVELY"));
        assertEquals("al&phabet", instance.toLowerCase("al&phaBET"));
    }
}