package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeBasedKeyValueStoreTest {

    @Test
    public void testTimeMap() {
        TimeBasedKeyValueStore.TimeMap instance = new TimeBasedKeyValueStore.TimeMap();
        instance.set("foo", "bar", 1);
        assertEquals("bar", instance.get("foo", 1));
        assertEquals("bar", instance.get("foo", 3));
        instance.set("foo", "bar2", 4);
        assertEquals("bar2", instance.get("foo", 4));
        assertEquals("bar2", instance.get("foo", 5));
    }

}
