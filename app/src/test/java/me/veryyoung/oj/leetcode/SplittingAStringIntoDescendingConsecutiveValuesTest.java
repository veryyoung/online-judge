package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SplittingAStringIntoDescendingConsecutiveValuesTest {

    @Test
    public void testSplitString() {
        SplittingAStringIntoDescendingConsecutiveValues instance = new SplittingAStringIntoDescendingConsecutiveValues();
        assertEquals(true, instance.splitString("0090089"));
        assertEquals(false, instance.splitString("1234"));
        assertEquals(true, instance.splitString("050043"));
        assertEquals(false, instance.splitString("9080701"));
        assertEquals(true, instance.splitString("4771447713"));
        assertEquals(true, instance.splitString("1000000000999999999"));
        assertEquals(true, instance.splitString("200100"));
        assertEquals(false, instance.splitString("15"));


    }
}
