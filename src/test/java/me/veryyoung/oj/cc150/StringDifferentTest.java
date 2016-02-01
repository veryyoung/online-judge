package me.veryyoung.oj.cc150;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yangxiongwei on 2016/2/1.
 */
public class StringDifferentTest {

    @Test
    public void testCheckDifferent() {
        StringDifferent stringDifferent = new StringDifferent();
        Assert.assertEquals(false, stringDifferent.checkDifferent("BarackObama"));
        Assert.assertEquals(true, stringDifferent.checkDifferent("aeiou"));
    }
}