package me.veryyoung.oj.cc150;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by veryyoung on 2016/2/2.
 */
public class ZipperTest {

    @Test
    public void testZipString() {
        Zipper zipper = new Zipper();
        Assert.assertEquals("a", zipper.zipString("a"));
        Assert.assertEquals("aa", zipper.zipString("aa"));
        Assert.assertEquals("a2b1c5a3", zipper.zipString("aabcccccaaa"));
        Assert.assertEquals("welcometonowcoderrrrr", zipper.zipString("welcometonowcoderrrrr"));
    }
}