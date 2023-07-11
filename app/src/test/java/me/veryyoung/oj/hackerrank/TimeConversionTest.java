package me.veryyoung.oj.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeConversionTest {

    @Test
    public void testTimeConversion() {
        TimeConversion instance = new TimeConversion();
        assertEquals("12:01:00", instance.timeConversion("12:01:00PM"));
        assertEquals("00:01:00", instance.timeConversion("12:01:00AM"));
        assertEquals("19:05:45", instance.timeConversion("07:05:45PM"));
        assertEquals("00:00:00", instance.timeConversion("12:00:00AM"));
        assertEquals("12:00:00", instance.timeConversion("12:00:00PM"));
    }
}
