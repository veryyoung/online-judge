package me.veryyoung.oj.hackerrank;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LonelyIntegerTest {

    @Test
    public void testLonelyInteger() {
        LonelyInteger instance = new LonelyInteger();
        assertEquals(4, instance.lonelyInteger(Arrays.asList(1, 2, 3, 4, 3, 2, 1)));
        assertEquals(1, instance.lonelyInteger(Arrays.asList(1)));
        assertEquals(2, instance.lonelyInteger(Arrays.asList(1, 1, 2)));
        assertEquals(2, instance.lonelyInteger(Arrays.asList(0, 0, 1, 2, 1)));
    }
}
