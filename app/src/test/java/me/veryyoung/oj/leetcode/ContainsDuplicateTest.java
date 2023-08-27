package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainsDuplicateTest {

    @Test
    public void testContainsDuplicate() {
        ContainsDuplicate instance = new ContainsDuplicate();
        assertEquals(true, instance.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertEquals(false, instance.containsDuplicate(new int[]{1, 2, 3, 4}));
        assertEquals(true, instance.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

}
