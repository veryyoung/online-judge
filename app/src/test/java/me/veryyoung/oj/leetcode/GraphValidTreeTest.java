package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphValidTreeTest {

    @Test
    public void testValidTree() {
        GraphValidTree instance = new GraphValidTree();
//        assertEquals(true, instance.validTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}}));
//        assertEquals(false, instance.validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}}));
        assertEquals(true, instance.validTree(2, new int[][]{{1, 0}}));
    }
}
