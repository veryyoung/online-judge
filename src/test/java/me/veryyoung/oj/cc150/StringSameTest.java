package me.veryyoung.oj.cc150;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by veryyoung on 2016/2/1.
 */
public class StringSameTest {

    @Test
    public void testCheckSam() {
        StringSame stringSame = new StringSame();
        Assert.assertEquals(true, stringSame.checkSam(null, null));
        Assert.assertEquals(false, stringSame.checkSam("", null));
        Assert.assertEquals(false, stringSame.checkSam(null, "test"));
        Assert.assertEquals(true, stringSame.checkSam("", ""));
        Assert.assertEquals(false, stringSame.checkSam("", "test"));
        Assert.assertEquals(true, stringSame.checkSam("This is nowcoder", "is This nowcoder"));
        Assert.assertEquals(false, stringSame.checkSam("Here you are", "Are you here"));
    }
}