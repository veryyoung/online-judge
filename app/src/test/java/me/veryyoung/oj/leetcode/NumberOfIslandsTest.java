package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumberOfIslandsTest {

    @Test
    public void testNumIslands() {
        NumberOfIslands instance = new NumberOfIslands();
        assertEquals(1, instance.numIslands(new char[][]{{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}}));
        assertEquals(3, instance.numIslands(new char[][]{{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}}));
    }
}
