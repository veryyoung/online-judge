package me.veryyoung.oj.cc150;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by veryyoung on 2016/2/3.
 */
public class ReverseEqualTest {

    @Test
    public void testCheckReverseEqual() {
        ReverseEqual reverseEqual = new ReverseEqual();
        Assert.assertTrue(reverseEqual.checkReverseEqual("", ""));
        Assert.assertFalse(reverseEqual.checkReverseEqual("", " "));
        Assert.assertFalse(reverseEqual.checkReverseEqual("Hello world", "worldhello "));
        Assert.assertTrue(reverseEqual.checkReverseEqual("waterbottle", "erbottlewat"));
    }
}