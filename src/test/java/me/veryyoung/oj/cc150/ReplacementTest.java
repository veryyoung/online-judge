package me.veryyoung.oj.cc150;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by veryyoung on 2016/2/1.
 */
public class ReplacementTest {

    @Test
    public void testReplaceSpace() {
        Replacement replacement = new Replacement();
        Assert.assertEquals("Mr%20John%20Smith", replacement.replaceSpace("Mr John Smith", 13));
        Assert.assertEquals("Hello%20%20World", replacement.replaceSpace("Hello  World", 12));
    }
}