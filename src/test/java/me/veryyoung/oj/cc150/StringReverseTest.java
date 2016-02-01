package me.veryyoung.oj.cc150;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by veryyoung on 2016/2/1.
 */
public class StringReverseTest {

    @Test
    public void testReverseString() {
        StringReverse stringReverse = new StringReverse();
        Assert.assertEquals(null, stringReverse.reverseString(null));
        Assert.assertEquals("", stringReverse.reverseString(""));
        Assert.assertEquals("a", stringReverse.reverseString("a"));
        Assert.assertEquals("aeiou", stringReverse.reverseString("uoiea"));
        Assert.assertEquals("redocwon si sihT", stringReverse.reverseString("This is nowcoder"));

    }
}