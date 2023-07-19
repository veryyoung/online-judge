package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static me.veryyoung.oj.util.ListNode.toArray;
import static me.veryyoung.oj.util.ListNode.toListNode;
import static org.junit.Assert.assertArrayEquals;

public class ReverseNodesInKGroupTest {

    @Test
    public void testReverseKGroup() {
        ReverseNodesInKGroup instance = new ReverseNodesInKGroup();
        assertArrayEquals(new int[]{2, 1, 4, 3, 5}, toArray(instance.reverseKGroup(toListNode(new int[]{1, 2, 3, 4, 5}), 2)));
        assertArrayEquals(new int[]{3, 2, 1, 4, 5}, toArray(instance.reverseKGroup(toListNode(new int[]{1, 2, 3, 4, 5}), 3)));
        assertArrayEquals(new int[]{2, 1, 4, 3, 6, 5}, toArray(instance.reverseKGroup(toListNode(new int[]{1, 2, 3, 4, 5, 6}), 2)));
        assertArrayEquals(new int[]{4, 3, 2, 1, 5, 6}, toArray(instance.reverseKGroup(toListNode(new int[]{1, 2, 3, 4, 5, 6}), 4)));
    }


}
