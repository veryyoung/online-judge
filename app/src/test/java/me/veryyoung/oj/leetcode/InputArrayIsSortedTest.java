package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InputArrayIsSortedTest {

    @Test
    public void testTwoSum() {
        InputArrayIsSorted instance = new InputArrayIsSorted();
        assertArrayEquals(new int[]{1, 2}, instance.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, instance.twoSum(new int[]{2, 3, 4}, 6));
        assertArrayEquals(new int[]{1, 2}, instance.twoSum(new int[]{-1, 0}, -1));
    }

}
